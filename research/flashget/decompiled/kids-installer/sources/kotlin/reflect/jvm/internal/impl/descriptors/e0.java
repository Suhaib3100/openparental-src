package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: Modality.kt */
/* loaded from: classes5.dex */
public enum e0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    @d5.d
    public static final a Companion = new a(null);

    /* compiled from: Modality.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final e0 a(boolean z5, boolean z6, boolean z7) {
            return z5 ? e0.SEALED : z6 ? e0.ABSTRACT : z7 ? e0.OPEN : e0.FINAL;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }
}
