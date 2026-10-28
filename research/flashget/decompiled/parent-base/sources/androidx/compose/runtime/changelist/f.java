package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a4;
import androidx.compose.runtime.changelist.g;
import androidx.compose.runtime.changelist.k;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.o3;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import ld.p;

/* compiled from: FixupList.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0019\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0003J@\u0010\"\u001a\u00020\b\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002\u001d\u0010!\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001f¢\u0006\u0002\b ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0011\u0010/\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/runtime/changelist/f;", "Landroidx/compose/runtime/changelist/l;", "<init>", "()V", "", "h", "()Z", "i", "Lkotlin/k2;", "c", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "f", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/d;", "groupAnchor", "d", "(Lld/a;ILandroidx/compose/runtime/d;)V", "e", "V", "T", "value", "Lkotlin/Function2;", "Lkotlin/u;", "block", "j", "(Ljava/lang/Object;Lld/p;)V", "", "linePrefix", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/k;", "Landroidx/compose/runtime/changelist/k;", "operations", "b", "pendingOperations", "g", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4178#2,5:92\n4178#2,5:178\n164#3,5:97\n172#3,2:105\n171#3,31:107\n164#3,5:138\n172#3,2:145\n171#3,31:147\n164#3,5:183\n172#3,2:190\n171#3,31:192\n456#4:102\n457#4:103\n458#4:104\n488#5:143\n489#5:144\n326#6:188\n327#6:189\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,5\n71#1:178,5\n58#1:97,5\n58#1:105,2\n58#1:107,31\n64#1:138,5\n64#1:145,2\n64#1:147,31\n78#1:183,5\n78#1:190,2\n78#1:192,31\n59#1:102\n60#1:103\n61#1:104\n65#1:143\n66#1:144\n79#1:188\n80#1:189\n*E\n"})
/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16000c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k operations = new k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k pendingOperations = new k();

    @Override // androidx.compose.runtime.changelist.l
    @fg.l
    public String a(@fg.l String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + this.operations.getOpCodesSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.a(linePrefix));
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void c() {
        this.pendingOperations.p();
        this.operations.p();
    }

    public final void d(@fg.l ld.a<? extends Object> factory, int insertIndex, @fg.l androidx.compose.runtime.d groupAnchor) {
        int q4;
        int i4;
        int q5;
        int q6;
        k kVar;
        int q7;
        k kVar2 = this.operations;
        g.m mVar = g.m.f16047d;
        kVar2.I(mVar);
        k.c.h(kVar2, 0, factory);
        k.c.g(kVar2, 0, insertIndex);
        k.c.h(kVar2, 1, groupAnchor);
        int i5 = kVar2.pushedIntMask;
        q4 = kVar2.q(mVar.getInts());
        if (i5 == q4) {
            int i6 = kVar2.pushedObjectMask;
            q5 = kVar2.q(mVar.getObjects());
            if (i6 == q5) {
                k kVar3 = this.pendingOperations;
                g.t tVar = g.t.f16059d;
                kVar3.I(tVar);
                k.c.g(kVar3, 0, insertIndex);
                k.c.h(kVar3, 0, groupAnchor);
                int i7 = kVar3.pushedIntMask;
                q6 = kVar3.q(tVar.getInts());
                if (i7 == q6) {
                    int i10 = kVar3.pushedObjectMask;
                    q7 = kVar3.q(tVar.getObjects());
                    if (i10 == q7) {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int ints = tVar.getInts();
                int i11 = 0;
                for (int i12 = 0; i12 < ints; i12++) {
                    if (((1 << i12) & kVar3.pushedIntMask) != 0) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(tVar.e(i12));
                        i11++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
                int objects = tVar.getObjects();
                int i13 = 0;
                int i14 = 0;
                while (i14 < objects) {
                    if (((1 << i14) & kVar3.pushedObjectMask) != 0) {
                        if (i11 > 0) {
                            a5.append(", ");
                        }
                        kVar = kVar3;
                        a5.append(tVar.f(i14));
                        i13++;
                    } else {
                        kVar = kVar3;
                    }
                    i14++;
                    kVar3 = kVar;
                }
                String sb3 = a5.toString();
                l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(tVar);
                sb4.append(". Not all arguments were provided. Missing ");
                c.a(sb4, i11, " int arguments (", sb2, ") and ");
                throw new IllegalStateException(a.a(sb4, i13, " object arguments (", sb3, ").").toString());
            }
        }
        StringBuilder sb5 = new StringBuilder();
        int ints2 = mVar.getInts();
        int i15 = 0;
        for (int i16 = 0; i16 < ints2; i16++) {
            if ((kVar2.pushedIntMask & (1 << i16)) != 0) {
                if (i15 > 0) {
                    sb5.append(", ");
                }
                sb5.append(mVar.e(i16));
                i15++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder a6 = b.a(sb6, "StringBuilder().apply(builderAction).toString()");
        int objects2 = mVar.getObjects();
        int i17 = 0;
        int i18 = 0;
        while (i17 < objects2) {
            if (((1 << i17) & kVar2.pushedObjectMask) != 0) {
                if (i15 > 0) {
                    a6.append(", ");
                }
                i4 = objects2;
                a6.append(mVar.f(i17));
                i18++;
            } else {
                i4 = objects2;
            }
            i17++;
            objects2 = i4;
        }
        String sb7 = a6.toString();
        l0.o(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(mVar);
        sb8.append(". Not all arguments were provided. Missing ");
        c.a(sb8, i15, " int arguments (", sb6, ") and ");
        throw new IllegalStateException(a.a(sb8, i18, " object arguments (", sb7, ").").toString());
    }

    public final void e() {
        if (!this.pendingOperations.C()) {
            throw androidx.compose.runtime.u.a("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.F(this.operations);
    }

    public final void f(@fg.l androidx.compose.runtime.e<?> applier, @fg.l a4 slots, @fg.l o3 rememberManager) {
        if (!this.pendingOperations.B()) {
            throw androidx.compose.runtime.u.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.w(applier, slots, rememberManager);
    }

    public final int g() {
        return this.operations.getOpCodesSize();
    }

    public final boolean h() {
        return this.operations.B();
    }

    public final boolean i() {
        return this.operations.C();
    }

    public final <V, T> void j(V value, @fg.l p<? super T, ? super V, k2> block) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.d0 d0Var = g.d0.f16023d;
        kVar.I(d0Var);
        k.c.h(kVar, 0, value);
        l0.n(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        k.c.h(kVar, 1, (p) u1.q(block, 2));
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(d0Var.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(d0Var.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = d0Var.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(d0Var.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = d0Var.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(d0Var.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(d0Var);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }
}
