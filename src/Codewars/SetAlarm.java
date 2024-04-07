package Codewars;

public class SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
     //Version
     // 1 return (employed && !vacation);
        //Version 2

        if ((employed == true) && (vacation == false)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(false, true));
    }
}

//        assertTrue("Should be true.", Alarm.setAlarm(true, false));
//        assertFalse("Should be false.", Alarm.setAlarm(true, true));
//        assertFalse("Should be false.", Alarm.setAlarm(false, false));
//        assertFalse("Should be false.", Alarm.setAlarm(false, true));

