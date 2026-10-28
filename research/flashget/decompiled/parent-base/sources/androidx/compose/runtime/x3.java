package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b(\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u0006*\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J9\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\b¢\u0006\u0004\b\u001f\u0010 J9\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\b¢\u0006\u0004\b#\u0010 J\r\u0010$\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b+\u0010*J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020/2\u0006\u00102\u001a\u00020\u00062\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b3\u00104J?\u0010:\u001a\u0002092\u0006\u0010\u001d\u001a\u00020\u001a2&\u00108\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u000105j\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u0001`7H\u0000¢\u0006\u0004\b:\u0010;J\u007f\u0010F\u001a\u0002092\u0006\u0010\"\u001a\u00020!2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00062\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?2\u0006\u0010B\u001a\u00020\u00062\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020(0Cj\b\u0012\u0004\u0012\u00020(`D2&\u00108\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u000105j\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u0001`7H\u0000¢\u0006\u0004\bF\u0010GJw\u0010H\u001a\u0002092\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00062\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?2\u0006\u0010B\u001a\u00020\u00062\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020(0Cj\b\u0012\u0004\u0012\u00020(`D2&\u00108\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u000105j\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u0001`7H\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0006\u0010J\u001a\u00020\u0006H\u0000¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020/¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u0004\u0018\u0001062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u000209¢\u0006\u0004\bQ\u0010\u0005J\r\u0010S\u001a\u00020R¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bU\u0010LJ!\u0010W\u001a\u0004\u0018\u00010@2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bW\u0010XJ\u0016\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030YH\u0096\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u0004\u0018\u00010\u00032\u0006\u0010\\\u001a\u00020@H\u0016¢\u0006\u0004\b]\u0010^R$\u0010=\u001a\u00020<2\u0006\u0010_\u001a\u00020<8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR$\u0010>\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010d\u001a\u0004\be\u0010fR4\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR$\u0010B\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010d\u001a\u0004\bl\u0010fR\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010dR$\u0010\"\u001a\u00020/2\u0006\u0010_\u001a\u00020/8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bo\u0010K\u001a\u0004\bp\u0010NR\"\u0010s\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010d\u001a\u0004\b\u0018\u0010f\"\u0004\bq\u0010rR2\u0010E\u001a\u0012\u0012\u0004\u0012\u00020(0Cj\b\u0012\u0004\u0012\u00020(`D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xRB\u00108\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u000105j\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u000206\u0018\u0001`78\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010NR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u007f¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/runtime/x3;", "Landroidx/compose/runtime/tooling/a;", "", "Landroidx/compose/runtime/tooling/b;", "<init>", "()V", "", "group", "Landroidx/compose/runtime/f3;", "v", "(I)Landroidx/compose/runtime/f3;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "index", "level", "r", "(Ljava/lang/StringBuilder;II)I", "", "a0", "()Ljava/util/List;", "b0", "g0", "q", "W", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/w3;", "Lkotlin/r0;", "name", "reader", "block", "h0", "(Lld/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/a4;", "writer", "v0", "d0", "()Landroidx/compose/runtime/w3;", "e0", "()Landroidx/compose/runtime/a4;", "Landroidx/compose/runtime/d;", "h", "(I)Landroidx/compose/runtime/d;", "q0", "anchor", "i", "(Landroidx/compose/runtime/d;)I", "", "f0", "(Landroidx/compose/runtime/d;)Z", "groupIndex", "V", "(ILandroidx/compose/runtime/d;)Z", "Ljava/util/HashMap;", "Landroidx/compose/runtime/j1;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Lkotlin/k2;", "l", "(Landroidx/compose/runtime/w3;Ljava/util/HashMap;)V", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "m", "(Landroidx/compose/runtime/a4;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "k0", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "target", "Z", "(I)Ljava/util/List;", "p", "()Z", "p0", "(I)Landroidx/compose/runtime/j1;", "r0", "", "j", "()Ljava/lang/String;", "n0", "slotIndex", "m0", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/b;", "<set-?>", "b", "[I", "x", "()[I", "I", "Q", "()I", "d", "[Ljava/lang/Object;", "R", "()[Ljava/lang/Object;", "e", "P", "f", "readers", "g", "U", "l0", "(I)V", "version", "Ljava/util/ArrayList;", "w", "()Ljava/util/ArrayList;", "i0", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "S", "()Ljava/util/HashMap;", "j0", "(Ljava/util/HashMap;)V", "isEmpty", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n150#1,8:3794\n166#1,4:3802\n171#1,3:3812\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3768\n4178#2,5:3773\n4178#2,5:3778\n4178#2,5:3783\n4178#2,5:3788\n1#3:3761\n3616#4,6:3762\n82#5:3793\n33#6,6:3806\n33#6,6:3815\n33#6,6:3821\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n338#1:3794,8\n367#1:3802,4\n367#1:3812,3\n194#1:3746,5\n195#1:3751,5\n211#1:3756,5\n222#1:3768,5\n233#1:3773,5\n253#1:3778,5\n254#1:3783,5\n266#1:3788,5\n213#1:3762,6\n269#1:3793\n369#1:3806,6\n500#1:3815,6\n509#1:3821,6\n*E\n"})
/* loaded from: classes.dex */
public final class x3 implements androidx.compose.runtime.tooling.a, Iterable<androidx.compose.runtime.tooling.b>, md.a {

    /* renamed from: k, reason: collision with root package name */
    public static final int f17317k = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private HashMap<d, j1> sourceInformationMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] groups = new int[0];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] slots = new Object[0];

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ArrayList<d> anchors = new ArrayList<>();

    private final List<Integer> W() {
        List<Integer> W;
        W = z3.W(this.groups, this.groupsSize * 5);
        return W;
    }

    private static final void X(w3 w3Var, int i4, List<d> list, k1.a aVar, x3 x3Var, List<f3> list2) {
        int p4 = w3Var.p();
        if (p4 != i4 && p4 != -3) {
            w3Var.a0();
            while (!w3Var.M()) {
                X(w3Var, i4, list, aVar, x3Var, list2);
            }
            w3Var.h();
            return;
        }
        if (p4 != -3) {
            list.add(w3.b(w3Var, 0, 1, null));
        }
        if (aVar.f75322b) {
            f3 v4 = x3Var.v(w3Var.getCurrentGroup());
            if (v4 != null) {
                list2.add(v4);
            } else {
                aVar.f75322b = false;
                list2.clear();
            }
        }
        w3Var.Y();
    }

    private final List<Integer> a0() {
        List<Integer> e02;
        e02 = z3.e0(this.groups, this.groupsSize * 5);
        return e02;
    }

    private final List<Integer> b0() {
        List<Integer> i02;
        i02 = z3.i0(this.groups, this.groupsSize * 5);
        return i02;
    }

    private final List<Integer> g0() {
        List<Integer> n02;
        n02 = z3.n0(this.groups, this.groupsSize * 5);
        return n02;
    }

    private final List<Integer> q() {
        List<Integer> O;
        O = z3.O(this.groups, this.groupsSize * 5);
        return O;
    }

    private final int r(StringBuilder sb, int i4, int i5) {
        int V;
        int h02;
        boolean Z;
        boolean L;
        boolean a02;
        boolean c02;
        boolean Y;
        int r02;
        int J;
        int k02;
        int l02;
        HashMap<d, j1> hashMap;
        j1 j1Var;
        String sourceInformation;
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i4);
        sb.append(")");
        d q02 = q0(i4);
        if (q02 != null && (hashMap = this.sourceInformationMap) != null && (j1Var = hashMap.get(q02)) != null && (sourceInformation = j1Var.getSourceInformation()) != null && (kotlin.text.v.s2(sourceInformation, "C(", false, 2, null) || kotlin.text.v.s2(sourceInformation, "CC(", false, 2, null))) {
            int p32 = kotlin.text.v.p3(sourceInformation, "(", 0, false, 6, null) + 1;
            int o32 = kotlin.text.v.o3(sourceInformation, ')', 0, false, 6, null);
            sb.append(" ");
            String substring = sourceInformation.substring(p32, o32);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(this.groups[i4 * 5]);
        V = z3.V(this.groups, i4);
        sb.append(", nodes=");
        h02 = z3.h0(this.groups, i4);
        sb.append(h02);
        sb.append(", size=");
        sb.append(V);
        Z = z3.Z(this.groups, i4);
        if (Z) {
            sb.append(", mark");
        }
        L = z3.L(this.groups, i4);
        if (L) {
            sb.append(", contains mark");
        }
        int s4 = s(this, i4);
        int i7 = i4 + 1;
        int s5 = s(this, i7);
        if (s4 < 0 || s4 > s5 || s5 > this.slotsSize) {
            sb.append(", *invalid data offsets " + s4 + '-' + s5 + '*');
        } else {
            a02 = z3.a0(this.groups, i4);
            if (a02) {
                StringBuilder sb2 = new StringBuilder(" objectKey=");
                Object[] objArr = this.slots;
                l02 = z3.l0(this.groups, i4);
                sb2.append(objArr[l02]);
                sb.append(sb2.toString());
            }
            c02 = z3.c0(this.groups, i4);
            if (c02) {
                StringBuilder sb3 = new StringBuilder(" node=");
                Object[] objArr2 = this.slots;
                k02 = z3.k0(this.groups, i4);
                sb3.append(objArr2[k02]);
                sb.append(sb3.toString());
            }
            Y = z3.Y(this.groups, i4);
            if (Y) {
                StringBuilder sb4 = new StringBuilder(" aux=");
                Object[] objArr3 = this.slots;
                J = z3.J(this.groups, i4);
                sb4.append(objArr3[J]);
                sb.append(sb4.toString());
            }
            r02 = z3.r0(this.groups, i4);
            if (r02 < s5) {
                sb.append(", slots=[");
                sb.append(r02);
                sb.append(": ");
                for (int i10 = r02; i10 < s5; i10++) {
                    if (i10 != r02) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.slots[i10]));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i11 = i4 + V;
        while (i7 < i11) {
            i7 += r(sb, i7, i5 + 1);
        }
        return V;
    }

    private static final int s(x3 x3Var, int i4) {
        int N;
        if (i4 >= x3Var.groupsSize) {
            return x3Var.slotsSize;
        }
        N = z3.N(x3Var.groups, i4);
        return N;
    }

    private static final int s0(k1.f fVar, x3 x3Var, int i4, int i5) {
        int m02;
        int V;
        int N;
        int r02;
        boolean c02;
        boolean a02;
        boolean Y;
        boolean c03;
        int h02;
        int V2;
        boolean K;
        boolean L;
        int k02;
        int i6 = fVar.f75327b;
        int i7 = i6 + 1;
        fVar.f75327b = i7;
        m02 = z3.m0(x3Var.groups, i6);
        if (m02 != i4) {
            StringBuilder a5 = androidx.collection.n1.a("Invalid parent index detected at ", i6, ", expected parent index to be ", i4, " found ");
            a5.append(m02);
            throw new IllegalStateException(a5.toString().toString());
        }
        V = z3.V(x3Var.groups, i6);
        int i10 = V + i6;
        if (i10 > x3Var.groupsSize) {
            throw new IllegalStateException(android.support.v4.media.a.a("A group extends past the end of the table at ", i6).toString());
        }
        if (i10 > i5) {
            throw new IllegalStateException(android.support.v4.media.a.a("A group extends past its parent group at ", i6).toString());
        }
        N = z3.N(x3Var.groups, i6);
        int N2 = i6 >= x3Var.groupsSize - 1 ? x3Var.slotsSize : z3.N(x3Var.groups, i7);
        if (N2 > x3Var.slots.length) {
            throw new IllegalStateException(androidx.collection.r2.a("Slots for ", i6, " extend past the end of the slot table").toString());
        }
        if (N > N2) {
            throw new IllegalStateException(android.support.v4.media.a.a("Invalid data anchor at ", i6).toString());
        }
        r02 = z3.r0(x3Var.groups, i6);
        if (r02 > N2) {
            throw new IllegalStateException(android.support.v4.media.a.a("Slots start out of range at ", i6).toString());
        }
        c02 = z3.c0(x3Var.groups, i6);
        a02 = z3.a0(x3Var.groups, i6);
        int i11 = (a02 ? 1 : 0) + (c02 ? 1 : 0);
        Y = z3.Y(x3Var.groups, i6);
        if (N2 - N < (Y ? 1 : 0) + i11) {
            throw new IllegalStateException(android.support.v4.media.a.a("Not enough slots added for group ", i6).toString());
        }
        c03 = z3.c0(x3Var.groups, i6);
        if (c03) {
            Object[] objArr = x3Var.slots;
            k02 = z3.k0(x3Var.groups, i6);
            if (objArr[k02] == null) {
                throw new IllegalStateException(android.support.v4.media.a.a("No node recorded for a node group at ", i6).toString());
            }
        }
        int i12 = 0;
        while (fVar.f75327b < i10) {
            i12 += s0(fVar, x3Var, i6, i10);
        }
        h02 = z3.h0(x3Var.groups, i6);
        V2 = z3.V(x3Var.groups, i6);
        if (h02 != i12) {
            StringBuilder a6 = androidx.collection.n1.a("Incorrect node count detected at ", i6, ", expected ", h02, ", received ");
            a6.append(i12);
            throw new IllegalStateException(a6.toString().toString());
        }
        int i13 = fVar.f75327b - i6;
        if (V2 != i13) {
            StringBuilder a7 = androidx.collection.n1.a("Incorrect slot count detected at ", i6, ", expected ", V2, ", received ");
            a7.append(i13);
            throw new IllegalStateException(a7.toString().toString());
        }
        K = z3.K(x3Var.groups, i6);
        if (K && i6 > 0) {
            L = z3.L(x3Var.groups, i4);
            if (!L) {
                throw new IllegalStateException(androidx.collection.q2.a("Expected group ", i4, " to record it contains a mark because ", i6, " does").toString());
            }
        }
        if (c03) {
            return 1;
        }
        return i12;
    }

    private static final void t0(x3 x3Var, j1 j1Var) {
        ArrayList<Object> f4 = j1Var.f();
        if (f4 != null) {
            int size = f4.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = f4.get(i4);
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (!dVar.b()) {
                        throw new IllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!x3Var.f0(dVar)) {
                        throw new IllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof j1) {
                    t0(x3Var, (j1) obj);
                }
            }
        }
    }

    private final f3 v(int group) {
        int i4 = group;
        while (i4 > 0) {
            o0 o0Var = new o0(this, i4);
            while (o0Var.hasNext()) {
                Object next = o0Var.next();
                if (next instanceof f3) {
                    f3 f3Var = (f3) next;
                    if (f3Var.u() && i4 != group) {
                        return f3Var;
                    }
                    f3Var.H(true);
                }
            }
            i4 = z3.m0(this.groups, i4);
        }
        return null;
    }

    /* renamed from: P, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* renamed from: Q, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @fg.l
    /* renamed from: R, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    @fg.m
    public final HashMap<d, j1> S() {
        return this.sourceInformationMap;
    }

    /* renamed from: T, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: U, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean V(int groupIndex, @fg.l d anchor) {
        int V;
        if (this.writer) {
            throw u.a("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            throw u.a("Invalid group index");
        }
        if (f0(anchor)) {
            V = z3.V(this.groups, groupIndex);
            int i4 = V + groupIndex;
            int location = anchor.getLocation();
            if (groupIndex <= location && location < i4) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    public final List<f3> Z(int target) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        k1.a aVar = new k1.a();
        aVar.f75322b = true;
        w3 d02 = d0();
        try {
            X(d02, target, arrayList, aVar, this, arrayList2);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            d02.e();
            a4 e02 = e0();
            try {
                e02.u1();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    d dVar = (d) arrayList.get(i4);
                    dVar.getClass();
                    if (e02.H(dVar) >= e02.getCurrentGroup()) {
                        e02.h1(dVar);
                        e02.J();
                    }
                }
                e02.n1();
                e02.W();
                e02.N();
                if (aVar.f75322b) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                e02.N();
                throw th;
            }
        } catch (Throwable th2) {
            d02.e();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.a
    @fg.m
    public androidx.compose.runtime.tooling.b c(@fg.l Object identityToFind) {
        return new y3(this, 0, 0, 4, null).c(identityToFind);
    }

    @fg.l
    public final w3 d0() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new w3(this);
    }

    @fg.l
    public final a4 e0() {
        if (this.writer) {
            throw u.a("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            throw u.a("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new a4(this);
    }

    @Override // androidx.compose.runtime.tooling.a
    @fg.l
    public Iterable<androidx.compose.runtime.tooling.b> f() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = androidx.compose.runtime.z3.p0(r3.anchors, r4.a(), r3.groupsSize);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(@fg.l androidx.compose.runtime.d r4) {
        /*
            r3 = this;
            boolean r0 = r4.b()
            if (r0 == 0) goto L22
            java.util.ArrayList<androidx.compose.runtime.d> r0 = r3.anchors
            int r1 = r4.getLocation()
            int r2 = r3.groupsSize
            int r0 = androidx.compose.runtime.z3.z(r0, r1, r2)
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.compose.runtime.d> r1 = r3.anchors
            java.lang.Object r0 = r1.get(r0)
            boolean r4 = kotlin.jvm.internal.l0.g(r0, r4)
            if (r4 == 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.x3.f0(androidx.compose.runtime.d):boolean");
    }

    @fg.l
    public final d h(int index) {
        int i4;
        int p02;
        if (this.writer) {
            throw u.a("use active SlotWriter to create an anchor location instead");
        }
        if (index < 0 || index >= (i4 = this.groupsSize)) {
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<d> arrayList = this.anchors;
        p02 = z3.p0(arrayList, index, i4);
        if (p02 >= 0) {
            return arrayList.get(p02);
        }
        d dVar = new d(index);
        arrayList.add(-(p02 + 1), dVar);
        return dVar;
    }

    public final <T> T h0(@fg.l ld.l<? super w3, ? extends T> block) {
        w3 d02 = d0();
        try {
            return block.invoke(d02);
        } finally {
            d02.e();
        }
    }

    public final int i(@fg.l d anchor) {
        if (this.writer) {
            throw u.a("Use active SlotWriter to determine anchor location instead");
        }
        if (anchor.b()) {
            return anchor.getLocation();
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed");
    }

    public final void i0(@fg.l ArrayList<d> arrayList) {
        this.anchors = arrayList;
    }

    @Override // androidx.compose.runtime.tooling.a
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<androidx.compose.runtime.tooling.b> iterator() {
        return new h1(this, 0, this.groupsSize);
    }

    @fg.l
    public final String j() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append('\n');
        int i4 = this.groupsSize;
        if (i4 > 0) {
            int i5 = 0;
            while (i5 < i4) {
                i5 += r(sb, i5, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void j0(@fg.m HashMap<d, j1> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final void k0(@fg.l int[] groups, int groupsSize, @fg.l Object[] slots, int slotsSize, @fg.l ArrayList<d> anchors, @fg.m HashMap<d, j1> sourceInformationMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
    }

    public final void l(@fg.l w3 reader, @fg.m HashMap<d, j1> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            throw u.a("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                try {
                    HashMap<d, j1> hashMap = this.sourceInformationMap;
                    if (hashMap != null) {
                        hashMap.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l0(int i4) {
        this.version = i4;
    }

    public final void m(@fg.l a4 writer, @fg.l int[] groups, int groupsSize, @fg.l Object[] slots, int slotsSize, @fg.l ArrayList<d> anchors, @fg.m HashMap<d, j1> sourceInformationMap) {
        if (writer.getTable() != this || !this.writer) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        k0(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap);
    }

    @fg.m
    public final Object m0(int group, int slotIndex) {
        int r02;
        r02 = z3.r0(this.groups, group);
        int i4 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i4 < this.groupsSize ? z3.N(this.groups, i4) : this.slots.length) - r02) ? t.INSTANCE.a() : this.slots[r02 + slotIndex];
    }

    @fg.l
    public final List<Object> n0(int group) {
        int N;
        N = z3.N(this.groups, group);
        int i4 = group + 1;
        return kotlin.collections.l.Ky(this.slots).subList(N, i4 < this.groupsSize ? z3.N(this.groups, i4) : this.slots.length);
    }

    public final boolean p() {
        boolean L;
        if (this.groupsSize <= 0) {
            return false;
        }
        L = z3.L(this.groups, 0);
        return L;
    }

    @fg.m
    public final j1 p0(int group) {
        d q02;
        HashMap<d, j1> hashMap = this.sourceInformationMap;
        if (hashMap == null || (q02 = q0(group)) == null) {
            return null;
        }
        return hashMap.get(q02);
    }

    @fg.m
    public final d q0(int index) {
        int i4;
        d S;
        if (this.writer) {
            throw u.a("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i4 = this.groupsSize)) {
            return null;
        }
        S = z3.S(this.anchors, index, i4);
        return S;
    }

    public final void r0() {
        int i4;
        int i5;
        int V;
        k1.f fVar = new k1.f();
        int i6 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i4 = fVar.f75327b;
                i5 = this.groupsSize;
                if (i4 >= i5) {
                    break;
                }
                V = z3.V(this.groups, i4);
                s0(fVar, this, -1, V + i4);
            }
            if (i4 != i5) {
                throw new IllegalStateException(("Incomplete group at root " + fVar.f75327b + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int i7 = this.slotsSize; i7 < length; i7++) {
            if (this.slots[i7] != null) {
                throw new IllegalStateException(android.support.v4.media.a.a("Non null value in the slot gap at index ", i7).toString());
            }
        }
        ArrayList<d> arrayList = this.anchors;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            d dVar = arrayList.get(i10);
            dVar.getClass();
            int i11 = i(dVar);
            if (i11 < 0 || i11 > this.groupsSize) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (i6 >= i11) {
                throw new IllegalArgumentException("Anchor is out of order");
            }
            i10++;
            i6 = i11;
        }
        HashMap<d, j1> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<d, j1> entry : hashMap.entrySet()) {
                d key = entry.getKey();
                j1 value = entry.getValue();
                if (!key.b()) {
                    throw new IllegalArgumentException("Source map contains invalid anchor");
                }
                if (!f0(key)) {
                    throw new IllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                t0(this, value);
            }
        }
    }

    public final <T> T v0(@fg.l ld.l<? super a4, ? extends T> block) {
        a4 e02 = e0();
        try {
            return block.invoke(e02);
        } finally {
            e02.N();
        }
    }

    @fg.l
    public final ArrayList<d> w() {
        return this.anchors;
    }

    @fg.l
    /* renamed from: x, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }
}
