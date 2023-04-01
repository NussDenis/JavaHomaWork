package Seminar_2;
//n! (произведение чисел от 1 до n)
public class Task_2 {
    private static String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    public static void parse() {
        StringBuilder sb = new StringBuilder();
        String[] name = json.split(",");
        for (String s : name) {
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")) {
                sb.append("Студент ").append(s.replaceAll("[\"{}\\[\\]]", "").split(":")[1]);
            }
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("оценка")) {
                sb.append(" получил(а) ").append(s.split(":")[1].replaceAll("[\"{}\\[\\]]", ""));
            }
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("предмет")) {
                sb.append(" по предмету ").append(s.split(":")[1].replaceAll("[\"{}\\[\\]]", "")).append(".\n");
            }
        }
        System.out.println(sb);
    }
}