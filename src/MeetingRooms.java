import java.util.*;

public class MeetingRooms {

    class Pair {
        int start;
        int end;

        public Pair() {
        }

        ;

        public Pair(int _start, int _end) {
            this.start = _start;
            this.end = _end;
        }

    }


    public class CompairPair implements Comparator<Pair> {

        @Override
        public int compare(MeetingRooms.Pair p1, MeetingRooms.Pair p2) {

            if (p1.start >= p2.start) {
                return 1;
            } else
                return -1;
        }
    }


    public ArrayList<Pair> getScheduleList() {
        ArrayList<Pair> scheduls = new ArrayList<Pair>();
        scheduls.add(new Pair(1, 2));
        scheduls.add(new Pair(3, 6));
        scheduls.add(new Pair(2, 5));
        return scheduls;
    }

    public static void main(String args[]) {
        MeetingRooms meetings = new MeetingRooms();

        ArrayList<Pair> schedules = meetings.getScheduleList();

        int no_of_meeting_rooms = meetings.meetingRoomCounter(schedules);

        System.out.println("No of meeting rooms required "+ no_of_meeting_rooms);


    }


    public int meetingRoomCounter(ArrayList<Pair> schedules) {

        if (schedules == null || schedules.size() == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        Collections.sort(schedules, new CompairPair());

        int meeting_rooms = 0;
        Pair first = schedules.get(0);
        map.put(meeting_rooms, first.end);

        for (int i = 1; i < schedules.size() - 1; i++) {

            Pair sec = schedules.get(i+1);

            if (sec.start >= first.end) { // non overlapping
                map.put(meeting_rooms, sec.end);
            } else {
                for ( int end_time : map.keySet()){
                    if(sec.start < end_time){
                        meeting_rooms++;
                        map.put(meeting_rooms, sec.end);
                    }
                }

            }
        }

        return meeting_rooms;

    }
}

