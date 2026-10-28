package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: NumberSymbolProvider.java */
/* loaded from: classes7.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f83083a = new a();

    /* compiled from: NumberSymbolProvider.java */
    static class a implements i {
        a() {
        }

        private DecimalFormatSymbols g(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }

        @Override // net.time4j.format.i
        public Locale[] a() {
            return DecimalFormatSymbols.getAvailableLocales();
        }

        @Override // net.time4j.format.i
        public char b(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale).getDecimalSeparator();
        }

        @Override // net.time4j.format.i
        public String c(Locale locale) {
            return locale.getLanguage().equals(ProtectedSandApp.s("镸\u0001")) ? ProtectedSandApp.s("镹\u0001") : String.valueOf('+');
        }

        @Override // net.time4j.format.i
        public j d(Locale locale) {
            return j.ARABIC;
        }

        @Override // net.time4j.format.i
        public String e(Locale locale) {
            return locale.getLanguage().equals(ProtectedSandApp.s("镸\u0001")) ? ProtectedSandApp.s("镺\u0001") : String.valueOf(DecimalFormatSymbols.getInstance(locale).getMinusSign());
        }

        @Override // net.time4j.format.i
        public char f(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale).getZeroDigit();
        }
    }

    Locale[] a();

    char b(Locale locale);

    String c(Locale locale);

    j d(Locale locale);

    String e(Locale locale);

    char f(Locale locale);
}
