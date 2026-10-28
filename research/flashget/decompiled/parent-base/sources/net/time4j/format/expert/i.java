package net.time4j.format.expert;

import java.io.IOException;
import java.util.Set;

/* compiled from: FormatProcessor.java */
/* loaded from: classes7.dex */
interface i<V> {
    net.time4j.engine.q<V> getElement();

    boolean isNumerical();

    void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4);

    int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException;

    i<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4);

    i<V> withElement(net.time4j.engine.q<V> qVar);
}
