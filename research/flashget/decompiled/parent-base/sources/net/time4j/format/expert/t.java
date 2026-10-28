package net.time4j.format.expert;

import java.util.HashMap;
import java.util.Map;

/* compiled from: NonAmbivalentMap.java */
/* loaded from: classes7.dex */
class t extends HashMap<net.time4j.engine.q<?>, Object> {
    private static final long serialVersionUID = 1245025551222311435L;

    t(Map<? extends net.time4j.engine.q<?>, ?> map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object put(net.time4j.engine.q<?> qVar, Object obj) {
        Object put = super.put(qVar, obj);
        if (qVar == null || put == null || put.equals(obj)) {
            return put;
        }
        throw new a(qVar);
    }
}
