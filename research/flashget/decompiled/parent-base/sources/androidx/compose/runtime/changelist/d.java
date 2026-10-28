package androidx.compose.runtime.changelist;

import androidx.compose.material3.j4;
import androidx.compose.runtime.a4;
import androidx.compose.runtime.changelist.g;
import androidx.compose.runtime.changelist.k;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.internal.n;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.o3;
import androidx.compose.runtime.p3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.x3;
import androidx.compose.runtime.y;
import androidx.compose.runtime.z;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import ld.p;

/* compiled from: ChangeList.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\u0003J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0003J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0003J\u001d\u0010*\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\b1\u00102J)\u00107\u001a\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b032\u0006\u00106\u001a\u000204¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b:\u0010\u001fJ@\u0010@\u001a\u00020\b\"\u0004\b\u0000\u0010;\"\u0004\b\u0001\u0010<2\u0006\u0010\u0013\u001a\u00028\u00012\u001d\u0010?\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0=¢\u0006\u0002\b>¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017¢\u0006\u0004\bD\u0010EJ%\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u0017¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u0017¢\u0006\u0004\bK\u00102J\u0015\u0010L\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u0017¢\u0006\u0004\bL\u00102J\u001d\u0010O\u001a\u00020\b2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160M¢\u0006\u0004\bO\u0010PJ\u001b\u0010S\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0Q¢\u0006\u0004\bS\u0010TJ\u001d\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020U2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u00020\b2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160Y2\u0006\u0010Z\u001a\u00020U¢\u0006\u0004\b[\u0010\\J/\u0010b\u001a\u00020\b2\b\u0010^\u001a\u0004\u0018\u00010]2\u0006\u0010`\u001a\u00020_2\u0006\u0010)\u001a\u00020a2\u0006\u0010F\u001a\u00020a¢\u0006\u0004\bb\u0010cJ%\u0010f\u001a\u00020\b2\u0006\u00106\u001a\u00020d2\u0006\u0010`\u001a\u00020_2\u0006\u0010e\u001a\u00020a¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\b¢\u0006\u0004\bh\u0010\u0003J!\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u00002\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010U¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010qR\u0011\u0010u\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006v"}, d2 = {"Landroidx/compose/runtime/changelist/d;", "Landroidx/compose/runtime/changelist/l;", "<init>", "()V", "", "f", "()Z", "g", "Lkotlin/k2;", "c", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "d", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/p3;", "value", "z", "(Landroidx/compose/runtime/p3;)V", "", "", "groupSlotIndex", "H", "(Ljava/lang/Object;I)V", "C", "k", "data", "F", "(Ljava/lang/Object;)V", "r", "Landroidx/compose/runtime/d;", "anchor", "q", "(Landroidx/compose/runtime/d;)V", "o", "E", "A", "Landroidx/compose/runtime/x3;", "from", "u", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/x3;)V", "Landroidx/compose/runtime/changelist/f;", "fixups", "v", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/x3;Landroidx/compose/runtime/changelist/f;)V", "offset", "w", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/y;", "action", "composition", "n", "(Lld/l;Landroidx/compose/runtime/y;)V", "node", "J", "T", "V", "Lkotlin/Function2;", "Lkotlin/u;", "block", "G", "(Ljava/lang/Object;Lld/p;)V", "removeFrom", "moveCount", "B", "(II)V", "to", "count", "x", "(III)V", "distance", "h", "I", "", "nodes", "m", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "D", "(Lld/a;)V", "Landroidx/compose/runtime/internal/n;", "effectiveNodeIndexOut", "l", "(Landroidx/compose/runtime/internal/n;Landroidx/compose/runtime/d;)V", "", "effectiveNodeIndex", "i", "(Ljava/util/List;Landroidx/compose/runtime/internal/n;)V", "Landroidx/compose/runtime/e2;", "resolvedState", "Landroidx/compose/runtime/z;", "parentContext", "Landroidx/compose/runtime/f2;", "j", "(Landroidx/compose/runtime/e2;Landroidx/compose/runtime/z;Landroidx/compose/runtime/f2;Landroidx/compose/runtime/f2;)V", "Landroidx/compose/runtime/n0;", "reference", "y", "(Landroidx/compose/runtime/n0;Landroidx/compose/runtime/z;Landroidx/compose/runtime/f2;)V", "p", "changeList", "s", "(Landroidx/compose/runtime/changelist/d;Landroidx/compose/runtime/internal/n;)V", "", "linePrefix", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/k;", "Landroidx/compose/runtime/changelist/k;", "operations", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,302:1\n164#2,5:303\n172#2,2:309\n171#2,31:311\n164#2,5:342\n172#2,2:349\n171#2,31:351\n164#2,5:382\n172#2,2:388\n171#2,31:390\n164#2,5:421\n172#2,2:427\n171#2,31:429\n164#2,5:460\n172#2,2:467\n171#2,31:469\n164#2,5:500\n172#2,2:508\n171#2,31:510\n164#2,5:541\n172#2,2:547\n171#2,31:549\n164#2,5:580\n172#2,2:587\n171#2,31:589\n164#2,5:620\n172#2,2:627\n171#2,31:629\n164#2,5:660\n172#2,2:667\n171#2,31:669\n164#2,5:700\n172#2,2:708\n171#2,31:710\n164#2,5:741\n172#2,2:747\n171#2,31:749\n164#2,5:780\n172#2,2:786\n171#2,31:788\n164#2,5:819\n172#2,2:825\n171#2,31:827\n164#2,5:858\n172#2,2:864\n171#2,31:866\n164#2,5:897\n172#2,2:904\n171#2,31:906\n164#2,5:937\n172#2,2:944\n171#2,31:946\n164#2,5:977\n172#2,2:986\n171#2,31:988\n164#2,5:1019\n172#2,2:1027\n171#2,31:1029\n164#2,5:1060\n172#2,2:1067\n171#2,31:1069\n152#3:308\n169#4:347\n170#4:348\n203#5:387\n230#6:426\n394#7:465\n395#7:466\n422#8:505\n423#8:506\n424#8:507\n257#9:546\n294#10:585\n295#10:586\n326#11:625\n327#11:626\n347#12:665\n348#12:666\n370#13:705\n369#13:706\n371#13:707\n116#14:746\n77#15:785\n94#16:824\n135#17:863\n539#18:902\n540#18:903\n568#19:942\n567#19:943\n594#20:982\n595#20:983\n597#20:984\n596#20:985\n655#21:1024\n656#21:1025\n657#21:1026\n681#22:1065\n682#22:1066\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n81#1:303,5\n81#1:309,2\n81#1:311,31\n87#1:342,5\n87#1:349,2\n87#1:351,31\n102#1:382,5\n102#1:388,2\n102#1:390,31\n112#1:421,5\n112#1:427,2\n112#1:429,31\n133#1:460,5\n133#1:467,2\n133#1:469,31\n144#1:500,5\n144#1:508,2\n144#1:510,31\n154#1:541,5\n154#1:547,2\n154#1:549,31\n163#1:580,5\n163#1:587,2\n163#1:589,31\n176#1:620,5\n176#1:627,2\n176#1:629,31\n184#1:660,5\n184#1:667,2\n184#1:669,31\n191#1:700,5\n191#1:708,2\n191#1:710,31\n199#1:741,5\n199#1:747,2\n199#1:749,31\n205#1:780,5\n205#1:786,2\n205#1:788,31\n212#1:819,5\n212#1:825,2\n212#1:827,31\n219#1:858,5\n219#1:864,2\n219#1:866,31\n228#1:897,5\n228#1:904,2\n228#1:906,31\n239#1:937,5\n239#1:944,2\n239#1:946,31\n253#1:977,5\n253#1:986,2\n253#1:988,31\n267#1:1019,5\n267#1:1027,2\n267#1:1029,31\n283#1:1060,5\n283#1:1067,2\n283#1:1069,31\n82#1:308\n88#1:347\n89#1:348\n103#1:387\n113#1:426\n134#1:465\n135#1:466\n145#1:505\n146#1:506\n147#1:507\n155#1:546\n164#1:585\n165#1:586\n177#1:625\n179#1:626\n185#1:665\n186#1:666\n192#1:705\n193#1:706\n194#1:707\n200#1:746\n206#1:785\n213#1:824\n220#1:863\n229#1:902\n230#1:903\n240#1:942\n241#1:943\n254#1:982\n255#1:983\n256#1:984\n257#1:985\n268#1:1024\n269#1:1025\n270#1:1026\n284#1:1065\n285#1:1066\n*E\n"})
/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f15983b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k operations = new k();

    public static /* synthetic */ void t(d dVar, d dVar2, n nVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            nVar = null;
        }
        dVar.s(dVar2, nVar);
    }

    public final void A() {
        this.operations.G(g.w.f16065d);
    }

    public final void B(int removeFrom, int moveCount) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.x xVar = g.x.f16067d;
        kVar.I(xVar);
        k.c.g(kVar, 0, removeFrom);
        k.c.g(kVar, 1, moveCount);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(xVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(xVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = xVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(xVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = xVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(xVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(xVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void C() {
        this.operations.G(g.y.f16069d);
    }

    public final void D(@fg.l ld.a<k2> effect) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.z zVar = g.z.f16071d;
        kVar.I(zVar);
        k.c.h(kVar, 0, effect);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(zVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(zVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = zVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = zVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(zVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(zVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void E() {
        this.operations.G(g.a0.f16008d);
    }

    public final void F(@m Object data) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.c0 c0Var = g.c0.f16019d;
        kVar.I(c0Var);
        k.c.h(kVar, 0, data);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(c0Var.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(c0Var.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = c0Var.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(c0Var.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = c0Var.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(c0Var.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(c0Var);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final <T, V> void G(V value, @fg.l p<? super T, ? super V, k2> block) {
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

    public final void H(@m Object value, int groupSlotIndex) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.e0 e0Var = g.e0.f16027d;
        kVar.I(e0Var);
        k.c.h(kVar, 0, value);
        k.c.g(kVar, 0, groupSlotIndex);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(e0Var.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(e0Var.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = e0Var.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(e0Var.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = e0Var.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(e0Var.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(e0Var);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void I(int count) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.f0 f0Var = g.f0.f16031d;
        kVar.I(f0Var);
        k.c.g(kVar, 0, count);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(f0Var.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(f0Var.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = f0Var.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(f0Var.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = f0Var.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(f0Var.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(f0Var);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void J(@m Object node) {
        if (node instanceof r) {
            this.operations.G(g.g0.f16035d);
        }
    }

    @Override // androidx.compose.runtime.changelist.l
    @fg.l
    public String a(@fg.l String linePrefix) {
        StringBuilder a5 = j4.a("ChangeList instance containing");
        a5.append(this.operations.getOpCodesSize());
        a5.append(" operations");
        if (a5.length() > 0) {
            a5.append(":\n");
            a5.append(this.operations.a(linePrefix));
        }
        String sb = a5.toString();
        l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    public final void c() {
        this.operations.p();
    }

    public final void d(@fg.l androidx.compose.runtime.e<?> applier, @fg.l a4 slots, @fg.l o3 rememberManager) {
        this.operations.w(applier, slots, rememberManager);
    }

    public final int e() {
        return this.operations.getOpCodesSize();
    }

    public final boolean f() {
        return this.operations.B();
    }

    public final boolean g() {
        return this.operations.C();
    }

    public final void h(int distance) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.a aVar = g.a.f16006d;
        kVar.I(aVar);
        k.c.g(kVar, 0, distance);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(aVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(aVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = aVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(aVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = aVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(aVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(aVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void i(@fg.l List<? extends Object> nodes, @fg.l n effectiveNodeIndex) {
        int q4;
        int q5;
        if (nodes.isEmpty()) {
            return;
        }
        k kVar = this.operations;
        g.c cVar = g.c.f16017d;
        kVar.I(cVar);
        k.c.h(kVar, 1, nodes);
        k.c.h(kVar, 0, effectiveNodeIndex);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(cVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(cVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = cVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(cVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = cVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(cVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(cVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void j(@m e2 resolvedState, @fg.l z parentContext, @fg.l f2 from, @fg.l f2 to) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.d dVar = g.d.f16021d;
        kVar.I(dVar);
        k.c.h(kVar, 0, resolvedState);
        k.c.h(kVar, 1, parentContext);
        k.c.h(kVar, 3, to);
        k.c.h(kVar, 2, from);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(dVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(dVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = dVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(dVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = dVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(dVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(dVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void k() {
        this.operations.G(g.e.f16025d);
    }

    public final void l(@fg.l n effectiveNodeIndexOut, @fg.l androidx.compose.runtime.d anchor) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.f fVar = g.f.f16029d;
        kVar.I(fVar);
        k.c.h(kVar, 0, effectiveNodeIndexOut);
        k.c.h(kVar, 1, anchor);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(fVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(fVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = fVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(fVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = fVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(fVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(fVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void m(@fg.l Object[] nodes) {
        int q4;
        int q5;
        if (nodes.length == 0) {
            return;
        }
        k kVar = this.operations;
        g.C0306g c0306g = g.C0306g.f16033d;
        kVar.I(c0306g);
        k.c.h(kVar, 0, nodes);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(c0306g.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(c0306g.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = c0306g.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(c0306g.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = c0306g.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(c0306g.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(c0306g);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void n(@fg.l ld.l<? super y, k2> action, @fg.l y composition) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.h hVar = g.h.f16037d;
        kVar.I(hVar);
        k.c.h(kVar, 0, action);
        k.c.h(kVar, 1, composition);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(hVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(hVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = hVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(hVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = hVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(hVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(hVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void o() {
        this.operations.G(g.i.f16039d);
    }

    public final void p() {
        this.operations.G(g.j.f16041d);
    }

    public final void q(@fg.l androidx.compose.runtime.d anchor) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.k kVar2 = g.k.f16043d;
        kVar.I(kVar2);
        k.c.h(kVar, 0, anchor);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(kVar2.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(kVar2.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = kVar2.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(kVar2.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = kVar2.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(kVar2.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(kVar2);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void r() {
        this.operations.G(g.l.f16045d);
    }

    public final void s(@fg.l d changeList, @m n effectiveNodeIndex) {
        int q4;
        int q5;
        if (changeList.operations.C()) {
            k kVar = this.operations;
            g.b bVar = g.b.f16010d;
            kVar.I(bVar);
            k.c.h(kVar, 0, changeList);
            k.c.h(kVar, 1, effectiveNodeIndex);
            int i4 = kVar.pushedIntMask;
            q4 = kVar.q(bVar.getInts());
            if (i4 == q4) {
                int i5 = kVar.pushedObjectMask;
                q5 = kVar.q(bVar.getObjects());
                if (i5 == q5) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            int ints = bVar.getInts();
            int i6 = 0;
            for (int i7 = 0; i7 < ints; i7++) {
                if (((1 << i7) & kVar.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(bVar.e(i7));
                    i6++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
            int objects = bVar.getObjects();
            int i10 = 0;
            for (int i11 = 0; i11 < objects; i11++) {
                if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        a5.append(", ");
                    }
                    a5.append(bVar.f(i11));
                    i10++;
                }
            }
            String sb3 = a5.toString();
            l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(bVar);
            sb4.append(". Not all arguments were provided. Missing ");
            c.a(sb4, i6, " int arguments (", sb2, ") and ");
            throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
        }
    }

    public final void u(@fg.l androidx.compose.runtime.d anchor, @fg.l x3 from) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.n nVar = g.n.f16049d;
        kVar.I(nVar);
        k.c.h(kVar, 0, anchor);
        k.c.h(kVar, 1, from);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(nVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(nVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = nVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(nVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = nVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(nVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(nVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void v(@fg.l androidx.compose.runtime.d anchor, @fg.l x3 from, @fg.l f fixups) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.o oVar = g.o.f16051d;
        kVar.I(oVar);
        k.c.h(kVar, 0, anchor);
        k.c.h(kVar, 1, from);
        k.c.h(kVar, 2, fixups);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(oVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(oVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = oVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(oVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = oVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(oVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(oVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void w(int offset) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.q qVar = g.q.f16054d;
        kVar.I(qVar);
        k.c.g(kVar, 0, offset);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(qVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(qVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = qVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(qVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = qVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(qVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(qVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void x(int to, int from, int count) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.r rVar = g.r.f16056d;
        kVar.I(rVar);
        k.c.g(kVar, 1, to);
        k.c.g(kVar, 0, from);
        k.c.g(kVar, 2, count);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(rVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(rVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = rVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(rVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = rVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(rVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(rVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void y(@fg.l n0 composition, @fg.l z parentContext, @fg.l f2 reference) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.u uVar = g.u.f16061d;
        kVar.I(uVar);
        k.c.h(kVar, 0, composition);
        k.c.h(kVar, 1, parentContext);
        k.c.h(kVar, 2, reference);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(uVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(uVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = uVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(uVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = uVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(uVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(uVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }

    public final void z(@fg.l p3 value) {
        int q4;
        int q5;
        k kVar = this.operations;
        g.v vVar = g.v.f16063d;
        kVar.I(vVar);
        k.c.h(kVar, 0, value);
        int i4 = kVar.pushedIntMask;
        q4 = kVar.q(vVar.getInts());
        if (i4 == q4) {
            int i5 = kVar.pushedObjectMask;
            q5 = kVar.q(vVar.getObjects());
            if (i5 == q5) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int ints = vVar.getInts();
        int i6 = 0;
        for (int i7 = 0; i7 < ints; i7++) {
            if (((1 << i7) & kVar.pushedIntMask) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.e(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = vVar.getObjects();
        int i10 = 0;
        for (int i11 = 0; i11 < objects; i11++) {
            if (((1 << i11) & kVar.pushedObjectMask) != 0) {
                if (i6 > 0) {
                    a5.append(", ");
                }
                a5.append(vVar.f(i11));
                i10++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        c.a(sb4, i6, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i10, " object arguments (", sb3, ").").toString());
    }
}
