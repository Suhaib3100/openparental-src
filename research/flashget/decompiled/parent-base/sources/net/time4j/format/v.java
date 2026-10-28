package net.time4j.format;

import java.io.IOException;
import java.text.ParsePosition;
import net.time4j.engine.ChronoException;

/* compiled from: TextElement.java */
/* loaded from: classes7.dex */
public interface v<V> extends net.time4j.engine.q<V> {
    V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar);

    void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException;
}
