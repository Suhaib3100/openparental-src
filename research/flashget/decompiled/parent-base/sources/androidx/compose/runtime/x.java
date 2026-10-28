package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010#\u001a\u00020\f*\u00020 2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010%\u001a\u00020\f*\u00020 2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b%\u0010$\u001a-\u0010*\u001a\u00020\f*\u00020 2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+\u001aW\u00102\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`00.j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`0`1\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010-H\u0002¢\u0006\u0004\b2\u00103\u001aa\u00105\u001a\u00020\u0002\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010-*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/0.j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`0`12\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0002¢\u0006\u0004\b5\u00106\u001ac\u00107\u001a\u0004\u0018\u00010\f\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010-*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/0.j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`0`12\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0002¢\u0006\u0004\b7\u00108\u001a[\u00109\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010-*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/0.j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010/j\b\u0012\u0004\u0012\u00028\u0001`0`12\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:\u001a/\u0010=\u001a\u0004\u0018\u00010(2\b\u00104\u001a\u0004\u0018\u00010(2\b\u0010;\u001a\u0004\u0018\u00010(2\b\u0010<\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b=\u0010>\u001a!\u0010B\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010C\u001a!\u0010D\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010C\u001a3\u0010H\u001a\u00020\f*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\bH\u0010I\u001a+\u0010L\u001a\u0004\u0018\u00010@*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bL\u0010M\u001a#\u0010N\u001a\u0004\u0018\u00010@*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020\u000fH\u0002¢\u0006\u0004\bN\u0010O\u001a)\u0010P\u001a\u00020\f*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bP\u0010Q\u001a/\u0010R\u001a\b\u0012\u0004\u0012\u00020@0?*\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bR\u0010S\u001a\u0013\u0010T\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\bT\u0010U\u001a\u0013\u0010V\u001a\u00020\u0002*\u00020\u000fH\u0002¢\u0006\u0004\bV\u0010W\u001a#\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0[*\u00020X2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b\\\u0010]\u001a#\u0010`\u001a\u00020\u000f*\u00020^2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u000fH\u0002¢\u0006\u0004\b`\u0010a\u001a+\u0010e\u001a\u00020\u000f*\u00020^2\u0006\u0010b\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u000fH\u0002¢\u0006\u0004\be\u0010f\u001a&\u0010h\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00022\f\u0010g\u001a\b\u0012\u0004\u0012\u00020(0\u0004H\u0080\b¢\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0002H\u0000¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010n\u001a\u00020m2\u0006\u0010l\u001a\u00020\nH\u0000¢\u0006\u0004\bn\u0010o\"\u001e\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bb\u0010q\u0012\u0004\br\u0010\u001d\"\u0014\u0010u\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010t\"\u0014\u0010w\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010t\"\u0014\u0010y\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010t\"\u001a\u0010{\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bz\u0010t\u0012\u0004\b,\u0010\u001d\"!\u0010\u0080\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010}\u0012\u0004\b\u007f\u0010\u001d\u001a\u0004\bt\u0010~\"\u001d\u0010\u0083\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010t\u0012\u0005\b\u0082\u0001\u0010\u001d\"$\u0010\u0087\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010}\u0012\u0005\b\u0086\u0001\u0010\u001d\u001a\u0005\b\u0085\u0001\u0010~\"\u001d\u0010\u008a\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010t\u0012\u0005\b\u0089\u0001\u0010\u001d\"$\u0010\u008e\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010}\u0012\u0005\b\u008d\u0001\u0010\u001d\u001a\u0005\b\u008c\u0001\u0010~\"\u001c\u0010\u0090\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\r\n\u0005\b\u008f\u0001\u0010t\u0012\u0004\b-\u0010\u001d\"#\u0010\u0093\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0014\n\u0005\b\u0091\u0001\u0010}\u0012\u0005\b\u0092\u0001\u0010\u001d\u001a\u0004\b\u0000\u0010~\"\u001d\u0010\u0096\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010t\u0012\u0005\b\u0095\u0001\u0010\u001d\"$\u0010\u009a\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010}\u0012\u0005\b\u0099\u0001\u0010\u001d\u001a\u0005\b\u0098\u0001\u0010~\"\u001d\u0010\u009d\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010t\u0012\u0005\b\u009c\u0001\u0010\u001d\"$\u0010¡\u0001\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010}\u0012\u0005\b \u0001\u0010\u001d\u001a\u0005\b\u009f\u0001\u0010~\"\u001d\u0010¤\u0001\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u000e\n\u0005\b¢\u0001\u0010t\u0012\u0005\b£\u0001\u0010\u001d\"\u0016\u0010¦\u0001\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0007\n\u0005\b¥\u0001\u0010t\"\u001d\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020@0§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010¨\u0001\"\u001c\u0010\u00ad\u0001\u001a\u00020(*\u00030ª\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001¨\u0006®\u0001"}, d2 = {"T", "Landroidx/compose/runtime/t;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/t0;", "block", "u", "(Landroidx/compose/runtime/t;ZLld/a;)Ljava/lang/Object;", "composer", "", "sourceInformation", "Lkotlin/k2;", "n0", "(Landroidx/compose/runtime/t;Ljava/lang/String;)V", "", "key", "p0", "(Landroidx/compose/runtime/t;ILjava/lang/String;)V", "b0", "()Z", "info", "s0", "(ILjava/lang/String;)V", "dirty1", "dirty2", "r0", "(IIILjava/lang/String;)V", "q0", "()V", "o0", "(Landroidx/compose/runtime/t;)V", "Landroidx/compose/runtime/a4;", "Landroidx/compose/runtime/o3;", "rememberManager", "h0", "(Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "y", "group", "index", "", "data", "i0", "(Landroidx/compose/runtime/a4;IILjava/lang/Object;)V", "K", "V", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "c0", "()Ljava/util/HashMap;", "value", "f0", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "g0", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/k2;", "e0", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "left", "right", "M", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/r1;", "location", "C", "(Ljava/util/List;I)I", "B", "Landroidx/compose/runtime/f3;", "scope", "instance", "a0", "(Ljava/util/List;ILandroidx/compose/runtime/f3;Ljava/lang/Object;)V", "start", "end", "D", "(Ljava/util/List;II)Landroidx/compose/runtime/r1;", "j0", "(Ljava/util/List;I)Landroidx/compose/runtime/r1;", "k0", "(Ljava/util/List;II)V", "A", "(Ljava/util/List;II)Ljava/util/List;", "t", "(Z)I", "s", "(I)Z", "Landroidx/compose/runtime/x3;", "Landroidx/compose/runtime/d;", "anchor", "", "v", "(Landroidx/compose/runtime/x3;Landroidx/compose/runtime/d;)Ljava/util/List;", "Landroidx/compose/runtime/w3;", "root", "z", "(Landroidx/compose/runtime/w3;II)I", "a", "b", "common", "d0", "(Landroidx/compose/runtime/w3;III)I", "lazyMessage", "m0", "(ZLld/a;)V", "l0", "(Z)V", "message", "", "x", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/m0;", "Landroidx/compose/runtime/m0;", "H", "compositionTracer", "I", "rootKey", "c", "nodeKey", "d", "defaultsKey", "e", "invocationKey", "f", "Ljava/lang/Object;", "()Ljava/lang/Object;", "J", "invocation", "g", "P", "providerKey", "h", "N", "O", "provider", "i", "G", "compositionLocalMapKey", "j", "E", "F", "compositionLocalMap", "k", "providerValuesKey", "l", "U", "providerValues", "m", "S", "providerMapsKey", "n", "Q", "R", "providerMaps", "o", "Y", "referenceKey", "p", "W", "X", "reference", "q", "Z", "reuseKey", "r", "invalidGroupLocation", "Ljava/util/Comparator;", "Ljava/util/Comparator;", "InvalidationLocationAscending", "Landroidx/compose/runtime/u1;", "L", "(Landroidx/compose/runtime/u1;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4197:1\n4178#1,5:4207\n4178#1,5:4227\n1#2:4198\n2049#3,8:4199\n361#4,7:4212\n150#5,8:4219\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n3914#1:4207,5\n4184#1:4227,5\n3893#1:4199,8\n3922#1:4212,7\n4036#1:4219,8\n*E\n"})
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private static m0 f17295a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17296b = 100;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17297c = 125;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17298d = -127;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17299e = 200;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17301g = 201;

    /* renamed from: i, reason: collision with root package name */
    public static final int f17303i = 202;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17305k = 203;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17307m = 204;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17309o = 206;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17311q = 207;

    /* renamed from: r, reason: collision with root package name */
    private static final int f17312r = -2;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Object f17300f = new q2("provider");

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final Object f17302h = new q2("provider");

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final Object f17304j = new q2("compositionLocalMap");

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final Object f17306l = new q2("providerValues");

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final Object f17308n = new q2("providers");

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final Object f17310p = new q2("reference");

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final Comparator<r1> f17313s = new w();

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<r1> A(List<r1> list, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        for (int B = B(list, i4); B < list.size(); B++) {
            r1 r1Var = list.get(B);
            if (r1Var.getLocation() >= i5) {
                break;
            }
            arrayList.add(r1Var);
        }
        return arrayList;
    }

    private static final int B(List<r1> list, int i4) {
        int C = C(list, i4);
        return C < 0 ? -(C + 1) : C;
    }

    private static final int C(List<r1> list, int i4) {
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int t4 = kotlin.jvm.internal.l0.t(list.get(i6).getLocation(), i4);
            if (t4 < 0) {
                i5 = i6 + 1;
            } else {
                if (t4 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 D(List<r1> list, int i4, int i5) {
        int B = B(list, i4);
        if (B >= list.size()) {
            return null;
        }
        r1 r1Var = list.get(B);
        if (r1Var.getLocation() < i5) {
            return r1Var;
        }
        return null;
    }

    @fg.l
    public static final Object E() {
        return f17304j;
    }

    @kotlin.w0
    public static /* synthetic */ void F() {
    }

    @kotlin.w0
    public static /* synthetic */ void G() {
    }

    private static /* synthetic */ void H() {
    }

    @fg.l
    public static final Object I() {
        return f17300f;
    }

    @kotlin.w0
    public static /* synthetic */ void J() {
    }

    @kotlin.w0
    public static /* synthetic */ void K() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object L(u1 u1Var) {
        return u1Var.getObjectKey() != null ? new t1(Integer.valueOf(u1Var.getKey()), u1Var.getObjectKey()) : Integer.valueOf(u1Var.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object M(Object obj, Object obj2, Object obj3) {
        t1 t1Var = obj instanceof t1 ? (t1) obj : null;
        if (t1Var == null) {
            return null;
        }
        if ((!kotlin.jvm.internal.l0.g(t1Var.e(), obj2) || !kotlin.jvm.internal.l0.g(t1Var.f(), obj3)) && (obj = M(t1Var.e(), obj2, obj3)) == null) {
            obj = M(t1Var.f(), obj2, obj3);
        }
        return obj;
    }

    @fg.l
    public static final Object N() {
        return f17302h;
    }

    @kotlin.w0
    public static /* synthetic */ void O() {
    }

    @kotlin.w0
    public static /* synthetic */ void P() {
    }

    @fg.l
    public static final Object Q() {
        return f17308n;
    }

    @kotlin.w0
    public static /* synthetic */ void R() {
    }

    @kotlin.w0
    public static /* synthetic */ void S() {
    }

    @fg.l
    public static final Object T() {
        return f17306l;
    }

    @kotlin.w0
    public static /* synthetic */ void U() {
    }

    @kotlin.w0
    public static /* synthetic */ void V() {
    }

    @fg.l
    public static final Object W() {
        return f17310p;
    }

    @kotlin.w0
    public static /* synthetic */ void X() {
    }

    @kotlin.w0
    public static /* synthetic */ void Y() {
    }

    @kotlin.w0
    public static /* synthetic */ void Z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(List<r1> list, int i4, f3 f3Var, Object obj) {
        int C = C(list, i4);
        androidx.compose.runtime.collection.d dVar = null;
        if (C < 0) {
            int i5 = -(C + 1);
            if (obj != null) {
                dVar = new androidx.compose.runtime.collection.d();
                dVar.add(obj);
            }
            list.add(i5, new r1(f3Var, i4, dVar));
            return;
        }
        if (obj == null) {
            list.get(C).e(null);
            return;
        }
        androidx.compose.runtime.collection.d<Object> a5 = list.get(C).a();
        if (a5 != null) {
            a5.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(r1 r1Var, r1 r1Var2) {
        return kotlin.jvm.internal.l0.t(r1Var.getLocation(), r1Var2.getLocation());
    }

    @q
    public static final boolean b0() {
        m0 m0Var = f17295a;
        return m0Var != null && m0Var.a();
    }

    private static final <K, V> HashMap<K, LinkedHashSet<V>> c0() {
        return new HashMap<>();
    }

    public static final int d(boolean z4) {
        return z4 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d0(w3 w3Var, int i4, int i5, int i6) {
        if (i4 == i5) {
            return i4;
        }
        if (i4 == i6 || i5 == i6) {
            return i6;
        }
        if (w3Var.U(i4) == i5) {
            return i5;
        }
        if (w3Var.U(i5) == i4) {
            return i4;
        }
        if (w3Var.U(i4) == w3Var.U(i5)) {
            return w3Var.U(i4);
        }
        int z4 = z(w3Var, i4, i6);
        int z5 = z(w3Var, i5, i6);
        int i7 = z4 - z5;
        for (int i10 = 0; i10 < i7; i10++) {
            i4 = w3Var.U(i4);
        }
        int i11 = z5 - z4;
        for (int i12 = 0; i12 < i11; i12++) {
            i5 = w3Var.U(i5);
        }
        while (i4 != i5) {
            i4 = w3Var.U(i4);
            i5 = w3Var.U(i5);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V e0(HashMap<K, LinkedHashSet<V>> hashMap, K k4) {
        V v4;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k4);
        if (linkedHashSet == null || (v4 = (V) kotlin.collections.w.E2(linkedHashSet)) == null) {
            return null;
        }
        g0(hashMap, k4, v4);
        return v4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean f0(HashMap<K, LinkedHashSet<V>> hashMap, K k4, V v4) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k4);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k4, linkedHashSet);
        }
        return linkedHashSet.add(v4);
    }

    private static final <K, V> kotlin.k2 g0(HashMap<K, LinkedHashSet<V>> hashMap, K k4, V v4) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k4);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v4);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k4);
        }
        return kotlin.k2.f75408a;
    }

    public static final void h0(@fg.l a4 a4Var, @fg.l o3 o3Var) {
        Iterator<Object> q02 = a4Var.q0();
        while (q02.hasNext()) {
            Object next = q02.next();
            if (next instanceof r) {
                o3Var.c((r) next);
            }
            if (next instanceof q3) {
                o3Var.b(((q3) next).getWrapped());
            }
            if (next instanceof f3) {
                ((f3) next).B();
            }
        }
        a4Var.b1();
    }

    private static final void i0(a4 a4Var, int i4, int i5, Object obj) {
        if (!(obj == a4Var.i1(i4, i5, t.INSTANCE.a()))) {
            throw u.a("Slot table is out of sync");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r1 j0(List<r1> list, int i4) {
        int C = C(list, i4);
        if (C >= 0) {
            return list.remove(C);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(List<r1> list, int i4, int i5) {
        int B = B(list, i4);
        while (B < list.size() && list.get(B).getLocation() < i5) {
            list.remove(B);
        }
    }

    public static final HashMap l() {
        return new HashMap();
    }

    public static final void l0(boolean z4) {
        if (!z4) {
            throw u.a("Check failed");
        }
    }

    public static final void m0(boolean z4, @fg.l ld.a<? extends Object> aVar) {
        if (z4) {
            return;
        }
        x(aVar.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @q
    public static final void n0(@fg.l t tVar, @fg.l String str) {
        tVar.b0(str);
    }

    @q
    public static final void o0(@fg.l t tVar) {
        tVar.n0();
    }

    @q
    public static final void p0(@fg.l t tVar, int i4, @fg.l String str) {
        tVar.f0(i4, str);
    }

    @q
    public static final void q0() {
        m0 m0Var = f17295a;
        if (m0Var != null) {
            m0Var.c();
        }
    }

    @q
    public static final void r0(int i4, int i5, int i6, @fg.l String str) {
        m0 m0Var = f17295a;
        if (m0Var != null) {
            m0Var.b(i4, i5, i6, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(int i4) {
        return i4 != 0;
    }

    private static final int t(boolean z4) {
        return z4 ? 1 : 0;
    }

    @q
    public static final <T> T u(@fg.l t tVar, boolean z4, @fg.l ld.a<? extends T> aVar) {
        T t4 = (T) tVar.Q();
        if (!z4 && t4 != t.INSTANCE.a()) {
            return t4;
        }
        T invoke = aVar.invoke();
        tVar.E(invoke);
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> v(x3 x3Var, d dVar) {
        ArrayList arrayList = new ArrayList();
        w3 d02 = x3Var.d0();
        try {
            w(d02, arrayList, x3Var.i(dVar));
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            return arrayList;
        } finally {
            d02.e();
        }
    }

    private static final void w(w3 w3Var, List<Object> list, int i4) {
        if (w3Var.O(i4)) {
            list.add(w3Var.Q(i4));
            return;
        }
        int i5 = i4 + 1;
        int J = w3Var.J(i4) + i4;
        while (i5 < J) {
            w(w3Var, list, i5);
            i5 += w3Var.J(i5);
        }
    }

    @fg.l
    public static final Void x(@fg.l String str) {
        throw new ComposeRuntimeError(android.support.v4.media.d.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void y(@fg.l a4 a4Var, @fg.l o3 o3Var) {
        int m02;
        int q12;
        int m03;
        int currentGroup = a4Var.getCurrentGroup();
        int currentGroupEnd = a4Var.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object N0 = a4Var.N0(currentGroup);
            if (N0 instanceof r) {
                o3Var.d((r) N0);
            }
            m02 = a4Var.m0(currentGroup);
            q12 = a4Var.q1(a4Var.groups, m02);
            int[] iArr = a4Var.groups;
            int i4 = currentGroup + 1;
            m03 = a4Var.m0(i4);
            int S = a4Var.S(iArr, m03);
            for (int i5 = q12; i5 < S; i5++) {
                int i6 = i5 - q12;
                Object obj = a4Var.slots[a4Var.T(i5)];
                if (obj instanceof q3) {
                    p3 wrapped = ((q3) obj).getWrapped();
                    if (!(wrapped instanceof s3)) {
                        i0(a4Var, currentGroup, i6, obj);
                        o3Var.b(wrapped);
                    }
                } else if (obj instanceof f3) {
                    i0(a4Var, currentGroup, i6, obj);
                    ((f3) obj).B();
                }
            }
            currentGroup = i4;
        }
    }

    private static final int z(w3 w3Var, int i4, int i5) {
        int i6 = 0;
        while (i4 > 0 && i4 != i5) {
            i4 = w3Var.U(i4);
            i6++;
        }
        return i6;
    }
}
