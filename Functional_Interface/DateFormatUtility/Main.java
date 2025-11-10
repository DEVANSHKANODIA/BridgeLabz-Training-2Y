import java.time.*;import java.time.format.*;
interface DateUtil{static String fmt(LocalDate d,String p){return d.format(DateTimeFormatter.ofPattern(p));}}