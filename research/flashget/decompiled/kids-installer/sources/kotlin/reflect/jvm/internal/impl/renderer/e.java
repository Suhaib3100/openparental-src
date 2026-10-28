package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.jvm.internal.w;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes5.dex */
public enum e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    @d5.d
    @p3.f
    public static final Set<e> ALL;

    @d5.d
    @p3.f
    public static final Set<e> ALL_EXCEPT_ANNOTATIONS;

    @d5.d
    public static final a Companion = new a(null);
    private final boolean includeByDefault;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    static {
        Set<e> a6;
        Set<e> lz;
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.includeByDefault) {
                arrayList.add(eVar);
            }
        }
        a6 = j0.a6(arrayList);
        ALL_EXCEPT_ANNOTATIONS = a6;
        lz = t.lz(values());
        ALL = lz;
    }

    e(boolean z5) {
        this.includeByDefault = z5;
    }
}
