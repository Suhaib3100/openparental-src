package h0;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Autofill.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.k
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0014B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Lh0/z;", "", "", "Lh0/b0;", "autofillTypes", "Li0/i;", "boundingBox", "Lkotlin/Function1;", "", "Lkotlin/k2;", "onFill", "<init>", "(Ljava/util/List;Li0/i;Lld/l;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Li0/i;", "d", "()Li0/i;", "g", "(Li0/i;)V", "Lld/l;", "f", "()Lld/l;", "I", "e", "id", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f73929f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static int f73930g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b0> autofillTypes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.i boundingBox;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<String, k2> onFill;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* compiled from: Autofill.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh0/z$a;", "", "<init>", "()V", "", "b", "()I", "previousId", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,105:1\n35#2:106\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:106\n*E\n"})
    /* renamed from: h0.z$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b() {
            int i4;
            synchronized (this) {
                Companion companion = z.INSTANCE;
                z.f73930g++;
                i4 = z.f73930g;
            }
            return i4;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@fg.l List<? extends b0> list, @fg.m i0.i iVar, @fg.m ld.l<? super String, k2> lVar) {
        this.autofillTypes = list;
        this.boundingBox = iVar;
        this.onFill = lVar;
        this.id = INSTANCE.b();
    }

    @fg.l
    public final List<b0> c() {
        return this.autofillTypes;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final i0.i getBoundingBox() {
        return this.boundingBox;
    }

    /* renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof z)) {
            return false;
        }
        z zVar = (z) other;
        return l0.g(this.autofillTypes, zVar.autofillTypes) && l0.g(this.boundingBox, zVar.boundingBox) && l0.g(this.onFill, zVar.onFill);
    }

    @fg.m
    public final ld.l<String, k2> f() {
        return this.onFill;
    }

    public final void g(@fg.m i0.i iVar) {
        this.boundingBox = iVar;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode() * 31;
        i0.i iVar = this.boundingBox;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        ld.l<String, k2> lVar = this.onFill;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public z(List list, i0.i iVar, ld.l lVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? j0.f74919b : list, (i4 & 2) != 0 ? null : iVar, lVar);
    }
}
