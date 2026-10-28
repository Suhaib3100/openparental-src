package androidx.core.content.pm;

import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShortcutInfoCompatSaver.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class r0<T> {

    /* compiled from: ShortcutInfoCompatSaver.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static class a extends r0<Void> {
        @Override // androidx.core.content.pm.r0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<x> list) {
            return null;
        }

        @Override // androidx.core.content.pm.r0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // androidx.core.content.pm.r0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @androidx.annotation.d
    public abstract T a(List<x> list);

    @androidx.annotation.n1
    public List<x> b() throws Exception {
        return new ArrayList();
    }

    @androidx.annotation.d
    public abstract T c();

    @androidx.annotation.d
    public abstract T d(List<String> list);
}
