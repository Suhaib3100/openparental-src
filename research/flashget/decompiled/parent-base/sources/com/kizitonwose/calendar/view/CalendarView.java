package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.internal.monthcalendar.MonthCalendarLayoutManager;
import com.kizitonwose.calendar.view.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: CalendarView.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002¡\u0001\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b#\u0010!J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b'\u0010&J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J!\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b2\u0010+J!\u00103\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b3\u00101J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b4\u0010+J!\u00105\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b5\u00101J)\u00107\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020.06\"\u00020.¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0015¢\u0006\u0004\b9\u0010&J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u0012J\u000f\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010;¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u0004\u0018\u00010(¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u0004\u0018\u00010(¢\u0006\u0004\bA\u0010@J7\u0010G\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00192\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010E¢\u0006\u0004\bG\u0010HJ-\u0010I\u001a\u00020\u000e2\b\b\u0002\u0010B\u001a\u00020\u00152\b\b\u0002\u0010C\u001a\u00020\u00152\b\b\u0002\u0010D\u001a\u00020\u0019H\u0007¢\u0006\u0004\bI\u0010JR6\u0010S\u001a\b\u0012\u0002\b\u0003\u0018\u00010K2\f\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR6\u0010[\u001a\b\u0012\u0002\b\u0003\u0018\u00010T2\f\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR6\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010T2\f\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010V\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR6\u0010g\u001a\u0016\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e\u0018\u00010`j\u0004\u0018\u0001`a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010l\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00105\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR*\u0010o\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00105\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR*\u0010r\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\bp\u0010i\"\u0004\bq\u0010kR.\u0010z\u001a\u0004\u0018\u00010s2\b\u0010L\u001a\u0004\u0018\u00010s8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR0\u0010\u007f\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b{\u00105\u0012\u0004\b~\u0010\u0012\u001a\u0004\b|\u0010i\"\u0004\b}\u0010kR/\u0010\u0084\u0001\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0004\bO\u0010^\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R3\u0010\u008c\u0001\u001a\u00030\u0085\u00012\u0007\u0010L\u001a\u00030\u0085\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R2\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0007\u0010L\u001a\u00030\u008d\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bh\u0010\u008e\u0001\u001a\u0006\b\u0086\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R3\u0010\u009a\u0001\u001a\u00030\u0093\u00012\u0007\u0010L\u001a\u00030\u0093\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R+\u0010 \u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b]\u0010\u009c\u0001\u001a\u0006\b\u0094\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010¢\u0001R\u0017\u0010¦\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010¥\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010¨\u0001R\u001a\u0010¬\u0001\u001a\u00030ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010«\u0001R\u0019\u0010B\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010\u00ad\u0001R\u0019\u0010C\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010\u00ad\u0001R\u0019\u0010D\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010®\u0001R\u0017\u0010±\u0001\u001a\u00030¯\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b{\u0010°\u0001R\u0017\u0010´\u0001\u001a\u00030²\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bt\u0010³\u0001¨\u0006µ\u0001"}, d2 = {"Lcom/kizitonwose/calendar/view/CalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attributeSet", "defStyleRes", "Lkotlin/k2;", "D", "(Landroid/util/AttributeSet;II)V", "E", "()V", "w0", "q0", "Lorg/threeten/bp/q;", "P", "()Lorg/threeten/bp/q;", "N", "Lorg/threeten/bp/d;", "O", "()Lorg/threeten/bp/d;", "currentMonth", "z", "(Lorg/threeten/bp/q;)Lorg/threeten/bp/q;", "", "C", "(Lorg/threeten/bp/q;)Z", "v", "B", "month", "U", "(Lorg/threeten/bp/q;)V", "p0", "Lcb/a;", "day", "T", "(Lcb/a;)V", "Lorg/threeten/bp/g;", "date", "Lcb/d;", "position", "R", "(Lorg/threeten/bp/g;Lcb/d;)V", "o0", "m0", "L", "I", "", "J", "(Lorg/threeten/bp/g;[Lcb/d;)V", "M", "G", "Lcb/b;", "f", "()Lcb/b;", "h", "e", "()Lcb/a;", "g", "startMonth", "endMonth", "firstDayOfWeek", "", "skipMonths", "j0", "(Lorg/threeten/bp/q;Lorg/threeten/bp/q;Lorg/threeten/bp/d;Ljava/util/List;)V", "u0", "(Lorg/threeten/bp/q;Lorg/threeten/bp/q;Lorg/threeten/bp/d;)V", "Lcom/kizitonwose/calendar/view/h;", "value", "b", "Lcom/kizitonwose/calendar/view/h;", "k", "()Lcom/kizitonwose/calendar/view/h;", "V", "(Lcom/kizitonwose/calendar/view/h;)V", "dayBinder", "Lcom/kizitonwose/calendar/view/i;", "c", "Lcom/kizitonwose/calendar/view/i;", "q", "()Lcom/kizitonwose/calendar/view/i;", "b0", "(Lcom/kizitonwose/calendar/view/i;)V", "monthHeaderBinder", "d", "o", "Z", "monthFooterBinder", "Lkotlin/Function1;", "Lcom/kizitonwose/calendar/view/MonthScrollListener;", "Lld/l;", "t", "()Lld/l;", "e0", "(Lld/l;)V", "monthScrollListener", "m", "()I", "X", "(I)V", "dayViewResource", "r", "c0", "monthHeaderResource", "p", "a0", "monthFooterResource", "", "i", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "f0", "(Ljava/lang/String;)V", "monthViewClass", "j", "w", "g0", "x", "orientation", "A", "()Z", "i0", "(Z)V", "scrollPaged", "Lcb/g;", "l", "Lcb/g;", "y", "()Lcb/g;", "h0", "(Lcb/g;)V", "outDateStyle", "Lcom/kizitonwose/calendar/view/e;", "Lcom/kizitonwose/calendar/view/e;", "()Lcom/kizitonwose/calendar/view/e;", "W", "(Lcom/kizitonwose/calendar/view/e;)V", "daySize", "Lcom/kizitonwose/calendar/view/g;", "n", "Lcom/kizitonwose/calendar/view/g;", "s", "()Lcom/kizitonwose/calendar/view/g;", "d0", "(Lcom/kizitonwose/calendar/view/g;)V", "monthMargins", "Lcom/kizitonwose/calendar/view/f;", "Lcom/kizitonwose/calendar/view/f;", "()Lcom/kizitonwose/calendar/view/f;", "Y", "(Lcom/kizitonwose/calendar/view/f;)V", "layoutHelper", "com/kizitonwose/calendar/view/CalendarView$b", "Lcom/kizitonwose/calendar/view/CalendarView$b;", "scrollListenerInternal", "Lcom/kizitonwose/calendar/view/internal/g;", "Lcom/kizitonwose/calendar/view/internal/g;", "horizontalSnapHelper", "Lcom/kizitonwose/calendar/view/internal/e;", "Lcom/kizitonwose/calendar/view/internal/e;", "verticalSnapHelper", "Landroidx/recyclerview/widget/a0;", "Landroidx/recyclerview/widget/a0;", "pageSnapHelper", "Lorg/threeten/bp/q;", "Lorg/threeten/bp/d;", "Lcom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarLayoutManager;", "()Lcom/kizitonwose/calendar/view/internal/monthcalendar/MonthCalendarLayoutManager;", "calendarLayoutManager", "Lcom/kizitonwose/calendar/view/internal/monthcalendar/c;", "()Lcom/kizitonwose/calendar/view/internal/monthcalendar/c;", "calendarAdapter", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarView.kt\ncom/kizitonwose/calendar/view/CalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,586:1\n1#2:587\n59#3,2:588\n11065#4:590\n11400#4,3:591\n37#5,2:594\n*S KotlinDebug\n*F\n+ 1 CalendarView.kt\ncom/kizitonwose/calendar/view/CalendarView\n*L\n225#1:588,2\n457#1:590\n457#1:591,3\n459#1:594,2\n*E\n"})
/* loaded from: classes6.dex */
public class CalendarView extends RecyclerView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h<?> dayBinder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i<?> monthHeaderBinder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i<?> monthFooterBinder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super cb.b, k2> monthScrollListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int dayViewResource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int monthHeaderResource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int monthFooterResource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String monthViewClass;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int orientation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean scrollPaged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private cb.g outDateStyle;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e daySize;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g monthMargins;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f layoutHelper;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b scrollListenerInternal;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.internal.g horizontalSnapHelper;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.internal.e verticalSnapHelper;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 pageSnapHelper;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.q startMonth;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.q endMonth;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private org.threeten.bp.d firstDayOfWeek;

    /* compiled from: CalendarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<cb.g> f66665a = kotlin.enums.c.c(cb.g.values());
    }

    /* compiled from: CalendarView.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/kizitonwose/calendar/view/CalendarView$b", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Lkotlin/k2;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(@fg.l RecyclerView recyclerView, int newState) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒈ\u0001"));
            if (newState == 0) {
                CalendarView.this.i().x();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@fg.l RecyclerView recyclerView, int dx, int dy) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒈ\u0001"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@fg.l Context context) {
        super(context);
        l0.p(context, ProtectedSandApp.s("ᒉ\u0001"));
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.monthMargins = g.f66720f;
        this.scrollListenerInternal = new b();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D(AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        if (isInEditMode()) {
            return;
        }
        setItemAnimator(null);
        setHasFixedSize(true);
        Context context = getContext();
        l0.o(context, ProtectedSandApp.s("ᒋ\u0001"));
        int[] iArr = k.j.f67005a;
        l0.o(iArr, ProtectedSandApp.s("ᒌ\u0001"));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, defStyleAttr, defStyleRes);
        X(obtainStyledAttributes.getResourceId(k.j.f67020f, this.dayViewResource));
        c0(obtainStyledAttributes.getResourceId(k.j.f67024h, this.monthHeaderResource));
        a0(obtainStyledAttributes.getResourceId(k.j.f67022g, this.monthFooterResource));
        g0(obtainStyledAttributes.getInt(k.j.f67028j, this.orientation));
        i0(obtainStyledAttributes.getBoolean(k.j.f67032l, this.orientation == 0));
        W((e) e.getEntries().get(obtainStyledAttributes.getInt(k.j.f67017e, this.daySize.ordinal())));
        h0((cb.g) a.f66665a.get(obtainStyledAttributes.getInt(k.j.f67030k, this.outDateStyle.ordinal())));
        f0(obtainStyledAttributes.getString(k.j.f67026i));
        obtainStyledAttributes.recycle();
        if (this.dayViewResource == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ᒍ\u0001"));
        }
    }

    private final void E() {
        if (getAdapter() == null || getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        setAdapter(getAdapter());
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(onSaveInstanceState);
        }
        post(new Runnable() { // from class: com.kizitonwose.calendar.view.d
            @Override // java.lang.Runnable
            public final void run() {
                CalendarView.F(CalendarView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(CalendarView calendarView) {
        l0.p(calendarView, ProtectedSandApp.s("ᒎ\u0001"));
        calendarView.i().x();
    }

    public static /* synthetic */ void K(CalendarView calendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒏ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        calendarView.I(gVar, dVar);
    }

    private final org.threeten.bp.q N() {
        org.threeten.bp.q qVar = this.endMonth;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒐ\u0001")).toString());
    }

    private final org.threeten.bp.d O() {
        org.threeten.bp.d dVar = this.firstDayOfWeek;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒑ\u0001")).toString());
    }

    private final org.threeten.bp.q P() {
        org.threeten.bp.q qVar = this.startMonth;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒒ\u0001")).toString());
    }

    public static /* synthetic */ void S(CalendarView calendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒓ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        calendarView.R(gVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.kizitonwose.calendar.view.internal.monthcalendar.c i() {
        RecyclerView.h adapter = getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᒔ\u0001"));
        return (com.kizitonwose.calendar.view.internal.monthcalendar.c) adapter;
    }

    private final MonthCalendarLayoutManager j() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᒕ\u0001"));
        return (MonthCalendarLayoutManager) layoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k0(CalendarView calendarView, org.threeten.bp.q qVar, org.threeten.bp.q qVar2, org.threeten.bp.d dVar, List list, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒖ\u0001"));
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        calendarView.j0(qVar, qVar2, dVar, list);
    }

    public static /* synthetic */ void n0(CalendarView calendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒗ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        calendarView.m0(gVar, dVar);
    }

    private final void q0() {
        i().H(P(), N(), this.outDateStyle, O());
    }

    public static /* synthetic */ void v0(CalendarView calendarView, org.threeten.bp.q qVar, org.threeten.bp.q qVar2, org.threeten.bp.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒘ\u0001"));
        }
        if ((i4 & 1) != 0) {
            qVar = calendarView.P();
        }
        if ((i4 & 2) != 0) {
            qVar2 = calendarView.N();
        }
        if ((i4 & 4) != 0) {
            dVar = calendarView.O();
        }
        calendarView.u0(qVar, qVar2, dVar);
    }

    private final void w0() {
        if (!this.scrollPaged) {
            this.pageSnapHelper.b(null);
            return;
        }
        int i4 = this.orientation;
        if ((i4 == 0 && this.pageSnapHelper != this.horizontalSnapHelper) || (i4 == 1 && this.pageSnapHelper != this.verticalSnapHelper)) {
            this.pageSnapHelper.b(null);
            this.pageSnapHelper = this.orientation == 0 ? this.horizontalSnapHelper : this.verticalSnapHelper;
        }
        this.pageSnapHelper.b(this);
    }

    public static /* synthetic */ void x() {
    }

    /* renamed from: A, reason: from getter */
    public final boolean getScrollPaged() {
        return this.scrollPaged;
    }

    public final boolean B(@fg.l org.threeten.bp.q currentMonth) {
        l0.p(currentMonth, ProtectedSandApp.s("ᒙ\u0001"));
        return v(currentMonth) != null;
    }

    public final boolean C(@fg.l org.threeten.bp.q currentMonth) {
        l0.p(currentMonth, ProtectedSandApp.s("ᒙ\u0001"));
        return z(currentMonth) != null;
    }

    public final void G() {
        i().D();
    }

    @kd.j
    public final void H(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒚ\u0001"));
        K(this, gVar, null, 2, null);
    }

    @kd.j
    public final void I(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᒚ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᒛ\u0001"));
        L(new cb.a(date, position));
    }

    public final void J(@fg.l org.threeten.bp.g date, @fg.l cb.d... position) {
        l0.p(date, ProtectedSandApp.s("ᒚ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᒛ\u0001"));
        if (position.length == 0) {
            position = new cb.d[]{cb.d.MonthDate};
        }
        ArrayList arrayList = new ArrayList(position.length);
        for (cb.d dVar : position) {
            arrayList.add(new cb.a(date, dVar));
        }
        Set a6 = w.a6(arrayList);
        com.kizitonwose.calendar.view.internal.monthcalendar.c i4 = i();
        cb.a[] aVarArr = (cb.a[]) a6.toArray(new cb.a[0]);
        i4.E((cb.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public final void L(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᒜ\u0001"));
        i().E(day);
    }

    public final void M(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᒝ\u0001"));
        i().F(month);
    }

    @kd.j
    public final void Q(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒚ\u0001"));
        S(this, gVar, null, 2, null);
    }

    @kd.j
    public final void R(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᒚ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᒛ\u0001"));
        T(new cb.a(date, position));
    }

    public final void T(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᒜ\u0001"));
        j().Q(day);
    }

    public final void U(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᒝ\u0001"));
        j().U(month);
    }

    public final void V(@fg.m h<?> hVar) {
        this.dayBinder = hVar;
        E();
    }

    public final void W(@fg.l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("ᒞ\u0001"));
        if (this.daySize != eVar) {
            this.daySize = eVar;
            E();
        }
    }

    public final void X(int i4) {
        if (this.dayViewResource != i4) {
            if (i4 == 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ᒟ\u0001"));
            }
            this.dayViewResource = i4;
            E();
        }
    }

    public final void Y(@fg.m f fVar) {
        this.layoutHelper = fVar;
    }

    public final void Z(@fg.m i<?> iVar) {
        this.monthFooterBinder = iVar;
        E();
    }

    public final void a0(int i4) {
        if (this.monthFooterResource != i4) {
            this.monthFooterResource = i4;
            E();
        }
    }

    public final void b0(@fg.m i<?> iVar) {
        this.monthHeaderBinder = iVar;
        E();
    }

    public final void c0(int i4) {
        if (this.monthHeaderResource != i4) {
            this.monthHeaderResource = i4;
            E();
        }
    }

    public final void d0(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒞ\u0001"));
        if (l0.g(this.monthMargins, gVar)) {
            return;
        }
        this.monthMargins = gVar;
        E();
    }

    @fg.m
    public final cb.a e() {
        return i().i();
    }

    public final void e0(@fg.m ld.l<? super cb.b, k2> lVar) {
        this.monthScrollListener = lVar;
    }

    @fg.m
    public final cb.b f() {
        return i().j();
    }

    public final void f0(@fg.m String str) {
        if (l0.g(this.monthViewClass, str)) {
            return;
        }
        this.monthViewClass = str;
        E();
    }

    @fg.m
    public final cb.a g() {
        return i().l();
    }

    public final void g0(int i4) {
        if (this.orientation != i4) {
            this.orientation = i4;
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            MonthCalendarLayoutManager monthCalendarLayoutManager = layoutManager instanceof MonthCalendarLayoutManager ? (MonthCalendarLayoutManager) layoutManager : null;
            if (monthCalendarLayoutManager != null) {
                monthCalendarLayoutManager.setOrientation(i4);
            }
            w0();
        }
    }

    @fg.m
    public final cb.b h() {
        return i().m();
    }

    public final void h0(@fg.l cb.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒞ\u0001"));
        if (this.outDateStyle != gVar) {
            this.outDateStyle = gVar;
            if (getAdapter() != null) {
                q0();
            }
        }
    }

    public final void i0(boolean z4) {
        if (this.scrollPaged != z4) {
            this.scrollPaged = z4;
            w0();
        }
    }

    public final void j0(@fg.l org.threeten.bp.q startMonth, @fg.l org.threeten.bp.q endMonth, @fg.l org.threeten.bp.d firstDayOfWeek, @fg.m List<org.threeten.bp.q> skipMonths) {
        l0.p(startMonth, ProtectedSandApp.s("ᒒ\u0001"));
        l0.p(endMonth, ProtectedSandApp.s("ᒐ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒑ\u0001"));
        db.f.a(startMonth, endMonth);
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.firstDayOfWeek = firstDayOfWeek;
        removeOnScrollListener(this.scrollListenerInternal);
        addOnScrollListener(this.scrollListenerInternal);
        setLayoutManager(new MonthCalendarLayoutManager(this));
        setAdapter(new com.kizitonwose.calendar.view.internal.monthcalendar.c(this, this.outDateStyle, startMonth, endMonth, firstDayOfWeek, skipMonths));
    }

    @fg.m
    public final h<?> k() {
        return this.dayBinder;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final e getDaySize() {
        return this.daySize;
    }

    @kd.j
    public final void l0(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᒚ\u0001"));
        n0(this, gVar, null, 2, null);
    }

    /* renamed from: m, reason: from getter */
    public final int getDayViewResource() {
        return this.dayViewResource;
    }

    @kd.j
    public final void m0(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᒚ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᒛ\u0001"));
        o0(new cb.a(date, position));
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final f getLayoutHelper() {
        return this.layoutHelper;
    }

    @fg.m
    public final i<?> o() {
        return this.monthFooterBinder;
    }

    public final void o0(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᒜ\u0001"));
        j().W(day);
    }

    /* renamed from: p, reason: from getter */
    public final int getMonthFooterResource() {
        return this.monthFooterResource;
    }

    public final void p0(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᒝ\u0001"));
        j().X(month);
    }

    @fg.m
    public final i<?> q() {
        return this.monthHeaderBinder;
    }

    /* renamed from: r, reason: from getter */
    public final int getMonthHeaderResource() {
        return this.monthHeaderResource;
    }

    @kd.j
    public final void r0() {
        v0(this, null, null, null, 7, null);
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final g getMonthMargins() {
        return this.monthMargins;
    }

    @kd.j
    public final void s0(@fg.l org.threeten.bp.q qVar) {
        l0.p(qVar, ProtectedSandApp.s("ᒒ\u0001"));
        v0(this, qVar, null, null, 6, null);
    }

    @fg.m
    public final ld.l<cb.b, k2> t() {
        return this.monthScrollListener;
    }

    @kd.j
    public final void t0(@fg.l org.threeten.bp.q qVar, @fg.l org.threeten.bp.q qVar2) {
        l0.p(qVar, ProtectedSandApp.s("ᒒ\u0001"));
        l0.p(qVar2, ProtectedSandApp.s("ᒐ\u0001"));
        v0(this, qVar, qVar2, null, 4, null);
    }

    @fg.m
    /* renamed from: u, reason: from getter */
    public final String getMonthViewClass() {
        return this.monthViewClass;
    }

    @kd.j
    public final void u0(@fg.l org.threeten.bp.q startMonth, @fg.l org.threeten.bp.q endMonth, @fg.l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startMonth, ProtectedSandApp.s("ᒒ\u0001"));
        l0.p(endMonth, ProtectedSandApp.s("ᒐ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒑ\u0001"));
        db.f.a(startMonth, endMonth);
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.firstDayOfWeek = firstDayOfWeek;
        q0();
    }

    @fg.m
    public final org.threeten.bp.q v(@fg.l org.threeten.bp.q currentMonth) {
        l0.p(currentMonth, ProtectedSandApp.s("ᒙ\u0001"));
        org.threeten.bp.q V = currentMonth.V(1L);
        if (V.u(this.endMonth)) {
            return null;
        }
        List<org.threeten.bp.q> v4 = i().v();
        if (v4 == null) {
            return V;
        }
        do {
            if (!V.v(this.endMonth) && !l0.g(V, this.endMonth)) {
                return null;
            }
            if (!v4.contains(V)) {
                return V;
            }
            V = V.V(1L);
        } while (!V.u(this.endMonth));
        return null;
    }

    /* renamed from: w, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    @fg.l
    /* renamed from: y, reason: from getter */
    public final cb.g getOutDateStyle() {
        return this.outDateStyle;
    }

    @fg.m
    public final org.threeten.bp.q z(@fg.l org.threeten.bp.q currentMonth) {
        l0.p(currentMonth, ProtectedSandApp.s("ᒙ\u0001"));
        org.threeten.bp.q E = currentMonth.E(1L);
        if (E.v(this.startMonth)) {
            return null;
        }
        List<org.threeten.bp.q> v4 = i().v();
        if (v4 == null) {
            return E;
        }
        while (true) {
            if (!E.u(this.startMonth) && !l0.g(E, this.startMonth)) {
                return null;
            }
            if (!v4.contains(E)) {
                return E;
            }
            E = E.E(1L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet) {
        super(context, attributeSet);
        l0.p(context, ProtectedSandApp.s("ᒉ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒊ\u0001"));
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.monthMargins = g.f66720f;
        this.scrollListenerInternal = new b();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
        D(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        l0.p(context, ProtectedSandApp.s("ᒉ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒊ\u0001"));
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        g.INSTANCE.getClass();
        this.monthMargins = g.f66720f;
        this.scrollListenerInternal = new b();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
        D(attributeSet, i4, i4);
    }
}
