package pe;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;
import net.time4j.engine.p;
import net.time4j.format.g;
import net.time4j.format.m;
import net.time4j.format.v;
import net.time4j.format.x;

/* compiled from: GregorianTextElement.java */
/* loaded from: classes7.dex */
public interface e<V> extends v<V> {
    V parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, x xVar, m mVar, g gVar);

    void print(p pVar, Appendable appendable, Locale locale, x xVar, m mVar) throws IOException, ChronoException;
}
