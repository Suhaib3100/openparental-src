package net.time4j;

/* compiled from: ZonalElement.java */
/* loaded from: classes7.dex */
public interface m1<V> extends net.time4j.engine.q<V> {
    net.time4j.engine.t<d0, V> at(net.time4j.tz.p pVar);

    net.time4j.engine.t<d0, V> atUTC();

    net.time4j.engine.t<d0, V> in(net.time4j.tz.l lVar);

    net.time4j.engine.t<d0, V> inStdTimezone();

    net.time4j.engine.t<d0, V> inTimezone(net.time4j.tz.k kVar);
}
