package androidx.core.content.pm;

import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShortcutInfoCompatSaver.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class v0<T> {

    /* compiled from: ShortcutInfoCompatSaver.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    /* loaded from: classes3.dex */
    public static class a extends v0<Void> {
        @Override // androidx.core.content.pm.v0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<u0> list) {
            return null;
        }

        @Override // androidx.core.content.pm.v0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // androidx.core.content.pm.v0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @androidx.annotation.d
    public abstract T a(List<u0> list);

    @androidx.annotation.n1
    public List<u0> b() throws Exception {
        return new ArrayList();
    }

    @androidx.annotation.d
    public abstract T c();

    @androidx.annotation.d
    public abstract T d(List<String> list);
}
