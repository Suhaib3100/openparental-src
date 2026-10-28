package net.time4j.format;

import java.text.ParseException;
import java.util.Locale;

/* compiled from: TemporalFormatter.java */
/* loaded from: classes7.dex */
public interface t<T> {
    t<T> a(net.time4j.tz.k kVar);

    t<T> c(String str);

    String d(T t4);

    t<T> e(Locale locale);

    T f(CharSequence charSequence) throws ParseException;

    String h(T t4);

    net.time4j.engine.d i();

    T j(CharSequence charSequence, r rVar) throws ParseException;

    t<T> k(g gVar);
}
