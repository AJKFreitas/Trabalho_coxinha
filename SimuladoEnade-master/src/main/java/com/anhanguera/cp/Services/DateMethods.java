package com.anhanguera.cp.Services;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import lombok.experimental.UtilityClass;

/** Created by psalum on 07/05/2015. */
@UtilityClass
public class DateMethods {

  public static String GetDate() {
    Locale locale = new Locale("pt", "BR");
    GregorianCalendar calendar = new GregorianCalendar();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy", locale);
    return formatador.format(calendar.getTime());
  }
}
