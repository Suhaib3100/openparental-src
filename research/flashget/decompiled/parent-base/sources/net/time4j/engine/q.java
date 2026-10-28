package net.time4j.engine;

import java.util.Comparator;
import java.util.Locale;

/* compiled from: ChronoElement.java */
/* loaded from: classes7.dex */
public interface q<V> extends Comparator<p> {
    int compare(p pVar, p pVar2);

    V getDefaultMaximum();

    V getDefaultMinimum();

    String getDisplayName(Locale locale);

    char getSymbol();

    Class<V> getType();

    boolean isDateElement();

    boolean isLenient();

    boolean isTimeElement();

    String name();
}
