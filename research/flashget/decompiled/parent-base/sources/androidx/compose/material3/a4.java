package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.lazy.grid.a;
import androidx.compose.material3.p4;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.apache.http.HttpStatus;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;
import r.a;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aT\u0010\u001f\u001a\u00020\u00002\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010'\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a6\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00162\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070*H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u009c\u0001\u00108\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00162#\u00103\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00070*2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00070*2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\u008f\u0001\u0010:\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00112!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00070*2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00070*2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b:\u0010;\u001aZ\u0010@\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020$2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u008f\u0001\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\b\u0010.\u001a\u0004\u0018\u00010\u00112!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00070*2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00070*2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bD\u0010E\u001aK\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u00070*2\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u0014H\u0080@¢\u0006\u0004\bF\u0010G\u001a\u001f\u0010H\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\bH\u0010I\u001ax\u0010Q\u001a\u00020\u00072\u0006\u0010K\u001a\u00020J2!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00070*2\u0006\u0010L\u001a\u00020\u00112\b\u0010M\u001a\u0004\u0018\u00010\u00112\b\u0010N\u001a\u0004\u0018\u00010\u00112\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010T\u001a\u00020S2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\bT\u0010U\u001a9\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\\\u0010]\u001ap\u0010e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u000b2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020[2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\be\u0010f\u001ab\u0010i\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00112!\u0010h\u001a\u001d\u0012\u0013\u0012\u00110S¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\u00070*2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00107\u001a\u0002062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bi\u0010j\u001a`\u0010l\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000b2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010d\u001a\u00020[2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bl\u0010m\u001ai\u0010u\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020[2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bu\u0010v\u001aB\u0010x\u001a\u00020\u00072\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010w\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bx\u0010y\u001a9\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f2\u0006\u0010\u0001\u001a\u00020z2\u0006\u0010|\u001a\u00020{2\u0006\u0010}\u001a\u00020[2\u0006\u0010~\u001a\u00020[H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u001e\u0010\u0086\u0001\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b'\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u001e\u0010\u0088\u0001\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001\"\u001e\u0010\u008a\u0001\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b:\u0010\u0083\u0001\u001a\u0006\b\u0089\u0001\u0010\u0085\u0001\" \u0010\u0090\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0018\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008d\u0001\"\u0017\u0010\u0093\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b@\u0010\u008d\u0001\"\u0016\u0010\u0094\u0001\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0083\u0001\"\u0017\u0010\u0096\u0001\u001a\u00020S8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0089\u0001\"\u0016\u0010\u0097\u0001\u001a\u00020S8\u0002X\u0082T¢\u0006\u0007\n\u0005\be\u0010\u0089\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0098\u0001²\u0006\u000e\u0010p\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/b4;", "state", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/x3;", "dateFormatter", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/u3;", "colors", "b", "(Landroidx/compose/material3/b4;Landroidx/compose/ui/q;Landroidx/compose/material3/x3;Lld/p;Lld/p;ZLandroidx/compose/material3/u3;Landroidx/compose/runtime/t;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/p4;", "initialDisplayMode", "Landroidx/compose/material3/s8;", "selectableDates", "N", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/b4;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "g", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/s8;)Landroidx/compose/material3/b4;", "modeToggleButton", "Landroidx/compose/ui/text/v0;", "headlineTextStyle", "Landroidx/compose/ui/unit/h;", "headerMinHeight", "content", "a", "(Landroidx/compose/ui/q;Lld/p;Lld/p;Lld/p;Landroidx/compose/material3/u3;Landroidx/compose/ui/text/v0;FLld/p;Landroidx/compose/runtime/t;I)V", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "j", "(Landroidx/compose/ui/q;ILld/l;Landroidx/compose/runtime/t;I)V", "selectedDateMillis", "displayedMonthMillis", "Lkotlin/r0;", "name", "dateInMillis", "onDateSelectionChange", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/s0;", "calendarModel", "n", "(Ljava/lang/Long;JILld/l;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "c", "(Ljava/lang/Long;JLld/l;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/graphics/d2;", "titleContentColor", "headlineContentColor", "minHeight", "f", "(Landroidx/compose/ui/q;Lld/p;JJFLld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/foundation/lazy/c0;", "lazyListState", "k", "(Landroidx/compose/foundation/lazy/c0;Ljava/lang/Long;Lld/l;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "O", "(Landroidx/compose/foundation/lazy/c0;Lld/l;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "(Landroidx/compose/material3/u3;Landroidx/compose/material3/s0;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/material3/j2;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Landroidx/compose/material3/t8;", "rangeSelectionInfo", "l", "(Landroidx/compose/material3/j2;Lld/l;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/t8;Landroidx/compose/material3/x3;Landroidx/compose/material3/s8;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "", "M", "(Lkotlin/ranges/l;)I", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "H", "(ZZZZZLandroidx/compose/runtime/t;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "i", "(Landroidx/compose/ui/q;ZLld/a;ZZZZLjava/lang/String;Landroidx/compose/material3/u3;Lld/p;Landroidx/compose/runtime/t;I)V", "year", "onYearSelected", "q", "(Landroidx/compose/ui/q;JLld/l;Landroidx/compose/material3/s8;Landroidx/compose/material3/s0;Lkotlin/ranges/l;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "currentYear", "p", "(Landroidx/compose/ui/q;ZZLld/a;ZLjava/lang/String;Landroidx/compose/material3/u3;Lld/p;Landroidx/compose/runtime/t;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "m", "(Landroidx/compose/ui/q;ZZZLjava/lang/String;Lld/a;Lld/a;Lld/a;Landroidx/compose/material3/u3;Landroidx/compose/runtime/t;I)V", "expanded", "r", "(Lld/a;ZLandroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/lazy/grid/k0;", "Lkotlinx/coroutines/r0;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/e;", "G", "(Landroidx/compose/foundation/lazy/grid/k0;Lkotlinx/coroutines/r0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "F", "L", "()F", "RecommendedSizeForAccessibility", "K", "MonthYearHeight", "I", "DatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/l1;", "d", "Landroidx/compose/foundation/layout/l1;", "J", "()Landroidx/compose/foundation/layout/l1;", "DatePickerModeTogglePadding", "e", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "h", "MaxCalendarRows", "YearsInRow", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n1116#2,6:2281\n1116#2,6:2327\n1116#2,6:2333\n1116#2,6:2342\n1116#2,3:2353\n1119#2,3:2359\n1116#2,6:2399\n1116#2,6:2405\n1116#2,6:2411\n1116#2,6:2542\n1116#2,6:2548\n1116#2,6:2589\n1116#2,6:2640\n1116#2,6:2712\n1116#2,6:2718\n1116#2,6:2724\n1116#2,6:2744\n1116#2,6:2750\n1116#2,6:2756\n74#3,6:2287\n80#3:2321\n84#3:2326\n73#3,7:2363\n80#3:2398\n74#3,6:2453\n80#3:2487\n84#3:2492\n84#3:2502\n75#3,5:2503\n80#3:2536\n84#3:2541\n75#3,5:2647\n80#3:2680\n84#3:2739\n78#4,11:2293\n91#4:2325\n78#4,11:2370\n78#4,11:2424\n78#4,11:2459\n91#4:2491\n91#4:2496\n91#4:2501\n78#4,11:2508\n91#4:2540\n78#4,11:2556\n78#4,11:2600\n91#4:2632\n91#4:2638\n78#4,11:2652\n78#4,11:2683\n91#4:2733\n91#4:2738\n78#4,11:2764\n91#4:2796\n456#5,8:2304\n464#5,3:2318\n467#5,3:2322\n25#5:2352\n456#5,8:2381\n464#5,3:2395\n456#5,8:2435\n464#5,3:2449\n456#5,8:2470\n464#5,3:2484\n467#5,3:2488\n467#5,3:2493\n467#5,3:2498\n456#5,8:2519\n464#5,3:2533\n467#5,3:2537\n456#5,8:2567\n464#5,3:2581\n456#5,8:2611\n464#5,3:2625\n467#5,3:2629\n467#5,3:2635\n456#5,8:2663\n464#5,3:2677\n456#5,8:2694\n464#5,3:2708\n467#5,3:2730\n467#5,3:2735\n456#5,8:2775\n464#5,3:2789\n467#5,3:2793\n3737#6,6:2312\n3737#6,6:2389\n3737#6,6:2443\n3737#6,6:2478\n3737#6,6:2527\n3737#6,6:2575\n3737#6,6:2619\n3737#6,6:2671\n3737#6,6:2702\n3737#6,6:2783\n74#7:2339\n74#7:2798\n1#8:2340\n154#9:2341\n154#9:2802\n154#9:2803\n154#9:2804\n154#9:2805\n154#9:2806\n154#9:2807\n154#9:2808\n487#10,4:2348\n491#10,2:2356\n495#10:2362\n487#11:2358\n67#12,7:2417\n74#12:2452\n78#12:2497\n69#12,5:2595\n74#12:2628\n78#12:2633\n91#13,2:2554\n93#13:2584\n97#13:2639\n91#13,2:2681\n93#13:2711\n97#13:2734\n91#13,2:2762\n93#13:2792\n97#13:2797\n33#14,4:2585\n38#14:2634\n92#15:2646\n111#16:2740\n113#16:2741\n119#16:2742\n83#16:2743\n81#17:2799\n107#17,2:2800\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n155#1:2269,6\n174#1:2275,6\n368#1:2281,6\n1357#1:2327,6\n1364#1:2333,6\n1400#1:2342,6\n1482#1:2353,3\n1482#1:2359,3\n1495#1:2399,6\n1507#1:2405,6\n1519#1:2411,6\n1643#1:2542,6\n1688#1:2548,6\n1748#1:2589,6\n1783#1:2640,6\n1825#1:2712,6\n1850#1:2718,6\n1855#1:2724,6\n1946#1:2744,6\n2087#1:2750,6\n2104#1:2756,6\n1304#1:2287,6\n1304#1:2321\n1304#1:2326\n1485#1:2363,7\n1485#1:2398\n1524#1:2453,6\n1524#1:2487\n1524#1:2492\n1485#1:2502\n1601#1:2503,5\n1601#1:2536\n1601#1:2541\n1793#1:2647,5\n1793#1:2680\n1793#1:2739\n1304#1:2293,11\n1304#1:2325\n1485#1:2370,11\n1523#1:2424,11\n1524#1:2459,11\n1524#1:2491\n1523#1:2496\n1485#1:2501\n1601#1:2508,11\n1601#1:2540\n1736#1:2556,11\n1746#1:2600,11\n1746#1:2632\n1736#1:2638\n1793#1:2652,11\n1800#1:2683,11\n1800#1:2733\n1793#1:2738\n2141#1:2764,11\n2141#1:2796\n1304#1:2304,8\n1304#1:2318,3\n1304#1:2322,3\n1482#1:2352\n1485#1:2381,8\n1485#1:2395,3\n1523#1:2435,8\n1523#1:2449,3\n1524#1:2470,8\n1524#1:2484,3\n1524#1:2488,3\n1523#1:2493,3\n1485#1:2498,3\n1601#1:2519,8\n1601#1:2533,3\n1601#1:2537,3\n1736#1:2567,8\n1736#1:2581,3\n1746#1:2611,8\n1746#1:2625,3\n1746#1:2629,3\n1736#1:2635,3\n1793#1:2663,8\n1793#1:2677,3\n1800#1:2694,8\n1800#1:2708,3\n1800#1:2730,3\n1793#1:2735,3\n2141#1:2775,8\n2141#1:2789,3\n2141#1:2793,3\n1304#1:2312,6\n1485#1:2389,6\n1523#1:2443,6\n1524#1:2478,6\n1601#1:2527,6\n1736#1:2575,6\n1746#1:2619,6\n1793#1:2671,6\n1800#1:2702,6\n2141#1:2783,6\n1393#1:2339\n2199#1:2798\n1393#1:2341\n2255#1:2802\n2256#1:2803\n2257#1:2804\n2258#1:2805\n2260#1:2806\n2262#1:2807\n2264#1:2808\n1482#1:2348,4\n1482#1:2356,2\n1482#1:2362\n1482#1:2358\n1523#1:2417,7\n1523#1:2452\n1523#1:2497\n1746#1:2595,5\n1746#1:2628\n1746#1:2633\n1736#1:2554,2\n1736#1:2584\n1736#1:2639\n1800#1:2681,2\n1800#1:2711\n1800#1:2734\n2141#1:2762,2\n2141#1:2792\n2141#1:2797\n1745#1:2585,4\n1745#1:2634\n1795#1:2646\n1906#1:2740\n1910#1:2741\n1914#1:2742\n1920#1:2743\n1483#1:2799\n1483#1:2800,2\n*E\n"})
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f9461a = androidx.compose.ui.unit.h.g(48);

    /* renamed from: b, reason: collision with root package name */
    private static final float f9462b = 56;

    /* renamed from: c, reason: collision with root package name */
    private static final float f9463c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f9464d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f9465e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f9466f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f9467g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f9468h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final int f9469i = 3;

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9470b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9471b;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9472b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(int i4) {
            super(2);
            this.f9471b = i4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2095706591, i4, -1, "androidx.compose.material3.Month.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1872)");
            }
            String d5 = androidx.compose.material3.b.d(this.f9471b + 1, 0, 0, false, 7, null);
            androidx.compose.ui.q c5 = androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, a.f9472b);
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            xa.c(d5, c5, 0L, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f21356e), 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 130556);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,2268:1\n74#2,6:2269\n80#2:2303\n84#2:2344\n78#3,11:2275\n78#3,11:2306\n91#3:2338\n91#3:2343\n456#4,8:2286\n464#4,3:2300\n456#4,8:2317\n464#4,3:2331\n467#4,3:2335\n467#4,3:2340\n3737#5,6:2294\n3737#5,6:2325\n91#6,2:2304\n93#6:2334\n97#6:2339\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n*L\n1319#1:2269,6\n1319#1:2303\n1319#1:2344\n1319#1:2275,11\n1325#1:2306,11\n1325#1:2338\n1319#1:2343\n1319#1:2286,8\n1319#1:2300,3\n1325#1:2317,8\n1325#1:2331,3\n1325#1:2335,3\n1319#1:2340,3\n1319#1:2294,6\n1325#1:2325,6\n1325#1:2304,2\n1325#1:2334\n1325#1:2339\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9473b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9474c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9475d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u3 f9476e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f9477f;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n68#2,6:2269\n74#2:2303\n78#2:2308\n78#3,11:2275\n91#3:2307\n456#4,8:2286\n464#4,3:2300\n467#4,3:2304\n3737#5,6:2294\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1$1$1$1\n*L\n1332#1:2269,6\n1332#1:2303\n1332#1:2308\n1332#1:2275,11\n1332#1:2307\n1332#1:2286,8\n1332#1:2300,3\n1332#1:2304,3\n1332#1:2294,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.x1 f9478b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9479c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(androidx.compose.foundation.layout.x1 x1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f9478b = x1Var;
                this.f9479c = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-962031352, i4, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1331)");
                }
                androidx.compose.ui.q e4 = androidx.compose.foundation.layout.x1.e(this.f9478b, androidx.compose.ui.q.INSTANCE, 1.0f, false, 2, null);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9479c;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, u3 u3Var, androidx.compose.ui.text.v0 v0Var) {
            super(2);
            this.f9473b = pVar;
            this.f9474c = pVar2;
            this.f9475d = pVar3;
            this.f9476e = u3Var;
            this.f9477f = v0Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-229007058, i4, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1318)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(companion, 0.0f, 1, null);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9473b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f9474c;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f9475d;
            u3 u3Var = this.f9476e;
            androidx.compose.ui.text.v0 v0Var = this.f9477f;
            tVar.P(-483455358);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            i.m r4 = iVar.r();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion2, r4, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion3, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            i.e p4 = (pVar == null || pVar2 == null) ? pVar != null ? iVar.p() : iVar.h() : iVar.l();
            androidx.compose.ui.q h5 = androidx.compose.foundation.layout.c2.h(companion, 0.0f, 1, null);
            c.InterfaceC0326c q4 = companion2.q();
            tVar.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, tVar, 48);
            tVar.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B2 = tVar.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(h5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a8);
            } else {
                tVar.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion3, tVar, d5, tVar, B2);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            tVar.P(-1011363262);
            if (pVar != null) {
                xa.a(v0Var, androidx.compose.runtime.internal.c.b(tVar, -962031352, true, new a(y1Var, pVar)), tVar, 48);
            }
            tVar.p0();
            tVar.P(1449827808);
            if (pVar2 != null) {
                pVar2.invoke(tVar, 0);
            }
            tVar.p0();
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            tVar.P(1680523079);
            if (pVar3 != null || pVar != null || pVar2 != null) {
                r4.b(null, 0.0f, u3Var.getDividerColor(), tVar, 0, 3);
            }
            if (androidx.compose.animation.y.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2 f9480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9481c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f9482d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Long f9483e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Long f9484f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ t8 f9485g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x3 f9486h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ s8 f9487i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9488j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9489k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(j2 j2Var, ld.l<? super Long, kotlin.k2> lVar, long j4, Long l4, Long l5, t8 t8Var, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f9480b = j2Var;
            this.f9481c = lVar;
            this.f9482d = j4;
            this.f9483e = l4;
            this.f9484f = l5;
            this.f9485g = t8Var;
            this.f9486h = x3Var;
            this.f9487i = s8Var;
            this.f9488j = u3Var;
            this.f9489k = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.l(this.f9480b, this.f9481c, this.f9482d, this.f9483e, this.f9484f, this.f9485g, this.f9486h, this.f9487i, this.f9488j, tVar, androidx.compose.runtime.g3.b(this.f9489k | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9493e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ u3 f9494f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f9495g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f9496h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9497i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9498j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, u3 u3Var, androidx.compose.ui.text.v0 v0Var, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, int i4) {
            super(2);
            this.f9490b = qVar;
            this.f9491c = pVar;
            this.f9492d = pVar2;
            this.f9493e = pVar3;
            this.f9494f = u3Var;
            this.f9495g = v0Var;
            this.f9496h = f4;
            this.f9497i = pVar4;
            this.f9498j = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.a(this.f9490b, this.f9491c, this.f9492d, this.f9493e, this.f9494f, this.f9495g, this.f9496h, this.f9497i, tVar, androidx.compose.runtime.g3.b(this.f9498j | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class c0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t8 f9499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u3 f9500c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(t8 t8Var, u3 u3Var) {
            super(1);
            this.f9499b = t8Var;
            this.f9500c = u3Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            g4.o(cVar, this.f9499b, this.f9500c.getDayInSelectionRangeContainerColor());
            cVar.G6();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b4 f9501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b4 b4Var) {
            super(2);
            this.f9501b = b4Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1504998463, i4, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:156)");
            }
            v3.f15005a.b(this.f9501b.e(), androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, a4.f9465e), tVar, 432, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n86#2,7:2269\n93#2:2304\n97#2:2309\n78#3,11:2276\n91#3:2308\n456#4,8:2287\n464#4,3:2301\n467#4,3:2305\n3737#5,6:2295\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n*L\n2168#1:2269,7\n2168#1:2304\n2168#1:2309\n2168#1:2276,11\n2168#1:2308\n2168#1:2287,8\n2168#1:2301,3\n2168#1:2305,3\n2168#1:2295,6\n*E\n"})
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9504d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9505e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9506f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9507g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9508h;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1$1\n*L\n2159#1:2269,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9509b;

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.a4$d0$a$a, reason: collision with other inner class name */
            static final class C0205a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f9510b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0205a(String str) {
                    super(1);
                    this.f9510b = str;
                }

                public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                    androidx.compose.ui.semantics.g.INSTANCE.getClass();
                    androidx.compose.ui.semantics.w.g1(zVar, androidx.compose.ui.semantics.g.f20299c);
                    androidx.compose.ui.semantics.w.a1(zVar, this.f9510b);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                    a(zVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(2);
                this.f9509b = str;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1377272806, i4, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2157)");
                }
                String str = this.f9509b;
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                tVar.P(1090374478);
                boolean q02 = tVar.q0(this.f9509b);
                String str2 = this.f9509b;
                Object Q = tVar.Q();
                if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new C0205a(str2);
                    tVar.E(Q);
                }
                tVar.p0();
                xa.c(str, androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131068);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(ld.a<kotlin.k2> aVar, boolean z4, String str, ld.a<kotlin.k2> aVar2, boolean z5, ld.a<kotlin.k2> aVar3, boolean z6) {
            super(2);
            this.f9502b = aVar;
            this.f9503c = z4;
            this.f9504d = str;
            this.f9505e = aVar2;
            this.f9506f = z5;
            this.f9507g = aVar3;
            this.f9508h = z6;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-962805198, i4, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2153)");
            }
            a4.r(this.f9502b, this.f9503c, null, androidx.compose.runtime.internal.c.b(tVar, 1377272806, true, new a(this.f9504d)), tVar, 3072, 4);
            if (!this.f9503c) {
                ld.a<kotlin.k2> aVar = this.f9505e;
                boolean z4 = this.f9506f;
                ld.a<kotlin.k2> aVar2 = this.f9507g;
                boolean z5 = this.f9508h;
                tVar.P(693286680);
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(androidx.compose.foundation.layout.i.f5073a.p(), androidx.compose.ui.c.INSTANCE.w(), tVar, 0);
                tVar.P(-1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a5);
                } else {
                    tVar.C();
                }
                ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, d5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a6);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
                e3 e3Var = e3.f10605a;
                e3Var.getClass();
                u5.e(aVar, null, z4, null, null, e3.f10608d, tVar, o.c.f32821k, 26);
                e3Var.getClass();
                u5.e(aVar2, null, z5, null, null, e3.f10609e, tVar, o.c.f32821k, 26);
                tVar.p0();
                tVar.H();
                tVar.p0();
                tVar.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b4 f9511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x3 f9512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b4 b4Var, x3 x3Var) {
            super(2);
            this.f9511b = b4Var;
            this.f9512c = x3Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1780043561, i4, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:162)");
            }
            v3.f15005a.a(this.f9511b.i(), this.f9511b.e(), this.f9512c, androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, a4.f9466f), tVar, 27648, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9513b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9515d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9516e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9517f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9518g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9519h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9520i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9521j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9522k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(androidx.compose.ui.q qVar, boolean z4, boolean z5, boolean z6, String str, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, ld.a<kotlin.k2> aVar3, u3 u3Var, int i4) {
            super(2);
            this.f9513b = qVar;
            this.f9514c = z4;
            this.f9515d = z5;
            this.f9516e = z6;
            this.f9517f = str;
            this.f9518g = aVar;
            this.f9519h = aVar2;
            this.f9520i = aVar3;
            this.f9521j = u3Var;
            this.f9522k = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.m(this.f9513b, this.f9514c, this.f9515d, this.f9516e, this.f9517f, this.f9518g, this.f9519h, this.f9520i, this.f9521j, tVar, androidx.compose.runtime.g3.b(this.f9522k | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$4\n*L\n184#1:2269,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b4 f9523b;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/p4;", "displayMode", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<p4, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b4 f9524b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b4 b4Var) {
                super(1);
                this.f9524b = b4Var;
            }

            public final void a(int i4) {
                this.f9524b.d(i4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(p4 p4Var) {
                a(p4Var.getValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b4 b4Var) {
            super(2);
            this.f9523b = b4Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1982226759, i4, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:180)");
            }
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, a4.J());
            int e4 = this.f9523b.e();
            tVar.P(-1036920264);
            boolean q02 = tVar.q0(this.f9523b);
            b4 b4Var = this.f9523b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(b4Var);
                tVar.E(Q);
            }
            tVar.p0();
            a4.j(j4, e4, (ld.l) Q, tVar, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class f0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f0 f9525b = new f0(1);

        f0() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.Z0(zVar, true);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n*L\n200#1:2269,6\n201#1:2275,6\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b4 f9526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x3 f9528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u3 f9529e;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "dateInMillis", "Lkotlin/k2;", "a", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b4 f9530b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b4 b4Var) {
                super(1);
                this.f9530b = b4Var;
            }

            public final void a(@fg.m Long l4) {
                this.f9530b.k(l4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "monthInMillis", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Long, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b4 f9531b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b4 b4Var) {
                super(1);
                this.f9531b = b4Var;
            }

            public final void a(long j4) {
                this.f9531b.a(j4);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Long l4) {
                a(l4.longValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b4 b4Var, androidx.compose.material3.s0 s0Var, x3 x3Var, u3 u3Var) {
            super(2);
            this.f9526b = b4Var;
            this.f9527c = s0Var;
            this.f9528d = x3Var;
            this.f9529e = u3Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1840727866, i4, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:195)");
            }
            Long i5 = this.f9526b.i();
            long f4 = this.f9526b.f();
            int e4 = this.f9526b.e();
            tVar.P(-1036919665);
            boolean q02 = tVar.q0(this.f9526b);
            b4 b4Var = this.f9526b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(b4Var);
                tVar.E(Q);
            }
            ld.l lVar = (ld.l) Q;
            tVar.p0();
            tVar.P(-1036919567);
            boolean q03 = tVar.q0(this.f9526b);
            b4 b4Var2 = this.f9526b;
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new b(b4Var2);
                tVar.E(Q2);
            }
            tVar.p0();
            a4.n(i5, f4, e4, lVar, (ld.l) Q2, this.f9527c, this.f9526b.c(), this.f9528d, this.f9526b.b(), this.f9529e, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/k;", "Landroidx/compose/material3/p4;", "Landroidx/compose/animation/x;", "a", "(Landroidx/compose/animation/k;)Landroidx/compose/animation/x;"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.k<p4>, androidx.compose.animation.x> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9532b;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "height", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9533b = new a(1);

            a() {
                super(1);
            }

            @fg.l
            public final Integer a(int i4) {
                return Integer.valueOf(i4);
            }

            @Override // ld.l
            public Integer invoke(Integer num) {
                return Integer.valueOf(num.intValue());
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "<anonymous parameter 0>", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f9534b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(int i4) {
                super(1);
                this.f9534b = i4;
            }

            @fg.l
            public final Integer a(int i4) {
                return Integer.valueOf(this.f9534b);
            }

            @Override // ld.l
            public Integer invoke(Integer num) {
                num.intValue();
                return Integer.valueOf(this.f9534b);
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "<anonymous parameter 0>", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f9535b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i4) {
                super(1);
                this.f9535b = i4;
            }

            @fg.l
            public final Integer a(int i4) {
                return Integer.valueOf(this.f9535b);
            }

            @Override // ld.l
            public Integer invoke(Integer num) {
                num.intValue();
                return Integer.valueOf(this.f9535b);
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "fullHeight", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<Integer, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f9536b = new d(1);

            d() {
                super(1);
            }

            @fg.l
            public final Integer a(int i4) {
                return Integer.valueOf(i4);
            }

            @Override // ld.l
            public Integer invoke(Integer num) {
                return Integer.valueOf(num.intValue());
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/u;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Landroidx/compose/animation/core/p0;", "a", "(JJ)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, androidx.compose.animation.core.p0<androidx.compose.ui.unit.u>> {

            /* renamed from: b, reason: collision with root package name */
            public static final e f9537b = new e(2);

            e() {
                super(2);
            }

            @fg.l
            public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> a(long j4, long j5) {
                return androidx.compose.animation.core.l.r(500, 0, c0.h0.f37356a.c(), 2, null);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.u uVar2) {
                return a(uVar.getPackedValue(), uVar2.getPackedValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(int i4) {
            super(1);
            this.f9532b = i4;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.x invoke(@fg.l androidx.compose.animation.k<p4> kVar) {
            int value = kVar.f().getValue();
            p4.INSTANCE.getClass();
            return kVar.h(p4.f(value, p4.f13207d) ? androidx.compose.animation.f.e(androidx.compose.animation.d0.K(null, a.f9533b, 1, null).c(androidx.compose.animation.d0.q(androidx.compose.animation.core.l.r(100, 100, null, 4, null), 0.0f, 2, null)), androidx.compose.animation.d0.s(androidx.compose.animation.core.l.r(100, 0, null, 6, null), 0.0f, 2, null).d(androidx.compose.animation.d0.Q(null, new b(this.f9532b), 1, null))) : androidx.compose.animation.f.e(androidx.compose.animation.d0.J(androidx.compose.animation.core.l.r(0, 50, null, 5, null), new c(this.f9532b)).c(androidx.compose.animation.d0.q(androidx.compose.animation.core.l.r(100, 100, null, 4, null), 0.0f, 2, null)), androidx.compose.animation.d0.Q(null, d.f9536b, 1, null).d(androidx.compose.animation.d0.s(androidx.compose.animation.core.l.r(100, 0, null, 6, null), 0.0f, 2, null))), androidx.compose.animation.f.c(true, e.f9537b));
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b4 f9538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x3 f9540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9541e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9542f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9543g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f9544h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9545i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9546j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(b4 b4Var, androidx.compose.ui.q qVar, x3 x3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, boolean z4, u3 u3Var, int i4, int i5) {
            super(2);
            this.f9538b = b4Var;
            this.f9539c = qVar;
            this.f9540d = x3Var;
            this.f9541e = pVar;
            this.f9542f = pVar2;
            this.f9543g = z4;
            this.f9544h = u3Var;
            this.f9545i = i4;
            this.f9546j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.b(this.f9538b, this.f9539c, this.f9540d, this.f9541e, this.f9542f, this.f9543g, this.f9544h, tVar, androidx.compose.runtime.g3.b(this.f9545i | 1), this.f9546j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/i;", "Landroidx/compose/material3/p4;", "mode", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/i;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h0 extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.animation.i, p4, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f9547b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9548c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9549d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9550e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9551f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9552g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x3 f9553h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ s8 f9554i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9555j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h0(Long l4, long j4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var) {
            super(4);
            this.f9547b = l4;
            this.f9548c = j4;
            this.f9549d = lVar;
            this.f9550e = lVar2;
            this.f9551f = s0Var;
            this.f9552g = lVar3;
            this.f9553h = x3Var;
            this.f9554i = s8Var;
            this.f9555j = u3Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.animation.i iVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-459778869, i5, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1439)");
            }
            p4.Companion companion = p4.INSTANCE;
            companion.getClass();
            if (p4.f(i4, p4.f13206c)) {
                tVar.P(-1168710170);
                a4.c(this.f9547b, this.f9548c, this.f9549d, this.f9550e, this.f9551f, this.f9552g, this.f9553h, this.f9554i, this.f9555j, tVar, 0);
                tVar.p0();
            } else {
                companion.getClass();
                if (p4.f(i4, p4.f13207d)) {
                    tVar.P(-1168709641);
                    r3.a(this.f9547b, this.f9549d, this.f9551f, this.f9552g, this.f9553h, this.f9554i, this.f9555j, tVar, 0);
                    tVar.p0();
                } else {
                    tVar.P(-1168709264);
                    tVar.p0();
                }
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.r
        public /* bridge */ /* synthetic */ kotlin.k2 i(androidx.compose.animation.i iVar, p4 p4Var, androidx.compose.runtime.t tVar, Integer num) {
            a(iVar, p4Var.getValue(), tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9557c;

        /* compiled from: DatePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1$1$1", f = "DatePicker.kt", i = {}, l = {1498}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9558b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.c0 f9559c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9559c = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9559c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9558b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.foundation.lazy.c0 c0Var = this.f9559c;
                        int u4 = c0Var.u() + 1;
                        this.f9558b = 1;
                        if (androidx.compose.foundation.lazy.c0.m(c0Var, u4, 0, this, 2, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                } catch (IllegalArgumentException unused) {
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(kotlinx.coroutines.r0 r0Var, androidx.compose.foundation.lazy.c0 c0Var) {
            super(0);
            this.f9556b = r0Var;
            this.f9557c = c0Var;
        }

        public final void a() {
            kotlinx.coroutines.k.f(this.f9556b, null, null, new a(this.f9557c, null), 3, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f9560b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9561c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9562d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9563e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9564f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9565g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9566h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f9567i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ s8 f9568j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u3 f9569k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f9570l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i0(Long l4, long j4, int i4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, int i5) {
            super(2);
            this.f9560b = l4;
            this.f9561c = j4;
            this.f9562d = i4;
            this.f9563e = lVar;
            this.f9564f = lVar2;
            this.f9565g = s0Var;
            this.f9566h = lVar3;
            this.f9567i = x3Var;
            this.f9568j = s8Var;
            this.f9569k = u3Var;
            this.f9570l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.n(this.f9560b, this.f9561c, this.f9562d, this.f9563e, this.f9564f, this.f9565g, this.f9566h, this.f9567i, this.f9568j, this.f9569k, tVar, androidx.compose.runtime.g3.b(this.f9570l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9571b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9572c;

        /* compiled from: DatePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$2$1$1", f = "DatePicker.kt", i = {}, l = {1510}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9573b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.c0 f9574c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.c0 c0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9574c = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9574c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9573b;
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.foundation.lazy.c0 c0Var = this.f9574c;
                        int u4 = c0Var.u() - 1;
                        this.f9573b = 1;
                        if (androidx.compose.foundation.lazy.c0.m(c0Var, u4, 0, this, 2, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                } catch (IllegalArgumentException unused) {
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlinx.coroutines.r0 r0Var, androidx.compose.foundation.lazy.c0 c0Var) {
            super(0);
            this.f9571b = r0Var;
            this.f9572c = c0Var;
        }

        public final void a() {
            kotlinx.coroutines.k.f(this.f9571b, null, null, new a(this.f9572c, null), 3, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.q0<String, String> f9575b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(kotlin.q0<String, String> q0Var) {
            super(1);
            this.f9575b = q0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f9575b.e());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<Boolean> f9576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.runtime.k2<Boolean> k2Var) {
            super(0);
            this.f9576b = k2Var;
        }

        public final void a() {
            a4.e(this.f9576b, !a4.d(r0));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f9577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9579d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(u3 u3Var, androidx.compose.material3.s0 s0Var, int i4) {
            super(2);
            this.f9577b = u3Var;
            this.f9578c = s0Var;
            this.f9579d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.o(this.f9577b, this.f9578c, tVar, androidx.compose.runtime.g3.b(this.f9579d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/s;", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/s;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2268:1\n67#2:2269\n1116#3,6:2270\n1116#3,6:2313\n74#4,6:2276\n80#4:2310\n84#4:2323\n78#5,11:2282\n91#5:2322\n456#6,8:2293\n464#6,3:2307\n467#6,3:2319\n3737#7,6:2301\n92#8:2311\n58#8:2312\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerContent$1$4$2\n*L\n1548#1:2269\n1549#1:2270,6\n1561#1:2313,6\n1549#1:2276,6\n1549#1:2310\n1549#1:2323\n1549#1:2282,11\n1549#1:2322\n1549#1:2293,8\n1549#1:2307,3\n1549#1:2319,3\n1549#1:2301,6\n1556#1:2311\n1556#1:2312\n*E\n"})
    static final class l extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.animation.s, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9580b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<Boolean> f9581c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9582d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9583e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9584f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j2 f9585g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ s8 f9586h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9587i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9588j;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9589b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f9589b = str;
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.h1(zVar, this.f9589b);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "year", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f9590b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<Boolean> f9591c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.c0 f9592d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.l f9593e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j2 f9594f;

            /* compiled from: DatePicker.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$4$2$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1568}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f9595b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.c0 f9596c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f9597d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlin.ranges.l f9598e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ j2 f9599f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(androidx.compose.foundation.lazy.c0 c0Var, int i4, kotlin.ranges.l lVar, j2 j2Var, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f9596c = c0Var;
                    this.f9597d = i4;
                    this.f9598e = lVar;
                    this.f9599f = j2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new a(this.f9596c, this.f9597d, this.f9598e, this.f9599f, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f9595b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.foundation.lazy.c0 c0Var = this.f9596c;
                        int k4 = (this.f9599f.k() + ((this.f9597d - this.f9598e.getFirst()) * 12)) - 1;
                        this.f9595b = 1;
                        if (androidx.compose.foundation.lazy.c0.S(c0Var, k4, 0, this, 2, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(kotlinx.coroutines.r0 r0Var, androidx.compose.runtime.k2<Boolean> k2Var, androidx.compose.foundation.lazy.c0 c0Var, kotlin.ranges.l lVar, j2 j2Var) {
                super(1);
                this.f9590b = r0Var;
                this.f9591c = k2Var;
                this.f9592d = c0Var;
                this.f9593e = lVar;
                this.f9594f = j2Var;
            }

            public final void a(int i4) {
                a4.e(this.f9591c, !a4.d(r0));
                kotlinx.coroutines.k.f(this.f9590b, null, null, new a(this.f9592d, i4, this.f9593e, this.f9594f, null), 3, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Integer num) {
                a(num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j4, androidx.compose.runtime.k2<Boolean> k2Var, kotlinx.coroutines.r0 r0Var, androidx.compose.foundation.lazy.c0 c0Var, kotlin.ranges.l lVar, j2 j2Var, s8 s8Var, androidx.compose.material3.s0 s0Var, u3 u3Var) {
            super(3);
            this.f9580b = j4;
            this.f9581c = k2Var;
            this.f9582d = r0Var;
            this.f9583e = c0Var;
            this.f9584f = lVar;
            this.f9585g = j2Var;
            this.f9586h = s8Var;
            this.f9587i = s0Var;
            this.f9588j = u3Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.animation.s sVar, androidx.compose.runtime.t tVar, Integer num) {
            a(sVar, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.animation.s sVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            u3 u3Var;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1193716082, i4, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1547)");
            }
            t9.Companion companion = t9.INSTANCE;
            String a5 = v9.a(x7.a.B, tVar, 0);
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            tVar.P(1247395025);
            boolean q02 = tVar.q0(a5);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(a5);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(companion2, false, (ld.l) Q, 1, null);
            long j4 = this.f9580b;
            androidx.compose.runtime.k2<Boolean> k2Var = this.f9581c;
            kotlinx.coroutines.r0 r0Var = this.f9582d;
            androidx.compose.foundation.lazy.c0 c0Var = this.f9583e;
            kotlin.ranges.l lVar = this.f9584f;
            j2 j2Var = this.f9585g;
            s8 s8Var = this.f9586h;
            androidx.compose.material3.s0 s0Var = this.f9587i;
            u3 u3Var2 = this.f9588j;
            tVar.P(-483455358);
            androidx.compose.ui.layout.m0 a6 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), tVar, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a7);
            } else {
                tVar.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion3, tVar, a6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, tVar, j5, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.foundation.layout.c2.l(companion2, androidx.compose.ui.unit.h.g(a4.L() * 7) - q4.f13649a.b()), a4.I(), 0.0f, 2, null);
            tVar.P(-1036317591);
            boolean q03 = tVar.q0(k2Var) | tVar.S(r0Var) | tVar.q0(c0Var) | tVar.S(lVar) | tVar.q0(j2Var);
            Object Q2 = tVar.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                u3Var = u3Var2;
                Q2 = new b(r0Var, k2Var, c0Var, lVar, j2Var);
                tVar.E(Q2);
            } else {
                u3Var = u3Var2;
            }
            tVar.p0();
            a4.q(m4, j4, (ld.l) Q2, s8Var, s0Var, lVar, u3Var, tVar, 6);
            r4.b(null, 0.0f, u3Var.getDividerColor(), tVar, 0, 3);
            if (androidx.compose.material3.t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class l0 extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str) {
            super(1);
            this.f9600b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.s1(zVar, new androidx.compose.ui.text.e(this.f9600b, null, null, 6, null));
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20309c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f9601b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9602c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9603d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9604e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9605f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9606g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x3 f9607h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ s8 f9608i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9609j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9610k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(Long l4, long j4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f9601b = l4;
            this.f9602c = j4;
            this.f9603d = lVar;
            this.f9604e = lVar2;
            this.f9605f = s0Var;
            this.f9606g = lVar3;
            this.f9607h = x3Var;
            this.f9608i = s8Var;
            this.f9609j = u3Var;
            this.f9610k = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.c(this.f9601b, this.f9602c, this.f9603d, this.f9604e, this.f9605f, this.f9606g, this.f9607h, this.f9608i, this.f9609j, tVar, androidx.compose.runtime.g3.b(this.f9610k | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Year$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n69#2,5:2269\n74#2:2302\n78#2:2307\n78#3,11:2274\n91#3:2306\n456#4,8:2285\n464#4,3:2299\n467#4,3:2303\n3737#5,6:2293\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Year$2\n*L\n2118#1:2269,5\n2118#1:2302\n2118#1:2307\n2118#1:2274,11\n2118#1:2306\n2118#1:2285,8\n2118#1:2299,3\n2118#1:2303,3\n2118#1:2293,6\n*E\n"})
    static final class m0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m0(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f9611b = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1573188346, i4, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2117)");
            }
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9611b;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, tVar, i6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/k2;", "", "a", "()Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.runtime.k2<Boolean>> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f9612b = new n(0);

        n() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.k2<Boolean> invoke() {
            androidx.compose.runtime.k2<Boolean> g4;
            g4 = androidx.compose.runtime.t4.g(Boolean.FALSE, null, 2, null);
            return g4;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9615d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9616e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9617f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9618g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f9619h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9620i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f9621j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n0(androidx.compose.ui.q qVar, boolean z4, boolean z5, ld.a<kotlin.k2> aVar, boolean z6, String str, u3 u3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f9613b = qVar;
            this.f9614c = z4;
            this.f9615d = z5;
            this.f9616e = aVar;
            this.f9617f = z6;
            this.f9618g = str;
            this.f9619h = u3Var;
            this.f9620i = pVar;
            this.f9621j = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.p(this.f9613b, this.f9614c, this.f9615d, this.f9616e, this.f9617f, this.f9618g, this.f9619h, this.f9620i, tVar, androidx.compose.runtime.g3.b(this.f9621j | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n67#2,7:2269\n74#2:2304\n78#2:2309\n78#3,11:2276\n91#3:2308\n456#4,8:2287\n464#4,3:2301\n467#4,3:2305\n3737#5,6:2295\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePickerHeader$1$1\n*L\n1615#1:2269,7\n1615#1:2304\n1615#1:2309\n1615#1:2276,11\n1615#1:2308\n1615#1:2287,8\n1615#1:2301,3\n1615#1:2305,3\n1615#1:2295,6\n*E\n"})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f9622b = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1936268514, i4, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1614)");
            }
            androidx.compose.ui.c g4 = androidx.compose.ui.c.INSTANCE.g();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9622b;
            tVar.P(733328855);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.layout.m0 i5 = androidx.compose.foundation.layout.m.i(g4, false, tVar, 6);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(companion);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, i5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n74#2:2269\n487#3,4:2270\n491#3,2:2278\n495#3:2284\n25#4:2274\n1116#5,3:2275\n1119#5,3:2281\n1116#5,6:2287\n487#6:2280\n87#7:2285\n85#7:2286\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n2011#1:2269\n2013#1:2270,4\n2013#1:2278,2\n2013#1:2284\n2013#1:2274\n2013#1:2275,3\n2013#1:2281,3\n2028#1:2287,6\n2013#1:2280\n2014#1:2285\n2015#1:2286\n*E\n"})
    static final class o0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9623b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9624c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u3 f9626e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, kotlin.k2> f9628g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ s8 f9629h;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9630b = new a(1);

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.a4$o0$a$a, reason: collision with other inner class name */
            static final class C0206a extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0206a f9631b = new C0206a(0);

                C0206a() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final b f9632b = new b(0);

                b() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.C1(zVar, new androidx.compose.ui.semantics.j(C0206a.f9631b, b.f9632b, false, 4, null));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/c0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.lazy.grid.c0, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.l f9633b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9634c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f9635d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9636e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f9637f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f9638g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f9639h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ld.l<Integer, kotlin.k2> f9640i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ s8 f9641j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ u3 f9642k;

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/q;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/grid/q;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n1116#2,6:2269\n1116#2,6:2275\n77#3:2281\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1$1\n*L\n2038#1:2269,6\n2057#1:2275,6\n2059#1:2281\n*E\n"})
            static final class a extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.grid.q, Integer, androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.ranges.l f9643b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9644c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f9645d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f9646e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f9647f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ int f9648g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ int f9649h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ ld.l<Integer, kotlin.k2> f9650i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ s8 f9651j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ u3 f9652k;

                /* compiled from: DatePicker.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.a4$o0$b$a$a, reason: collision with other inner class name */
                static final class C0207a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9653b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f9654c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.r0 f9655d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f9656e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ String f9657f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0207a(androidx.compose.foundation.lazy.grid.k0 k0Var, int i4, kotlinx.coroutines.r0 r0Var, String str, String str2) {
                        super(1);
                        this.f9653b = k0Var;
                        this.f9654c = i4;
                        this.f9655d = r0Var;
                        this.f9656e = str;
                        this.f9657f = str2;
                    }

                    public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                        androidx.compose.foundation.lazy.grid.k kVar;
                        androidx.compose.ui.semantics.w.b1(zVar, (this.f9653b.r() == this.f9654c || ((kVar = (androidx.compose.foundation.lazy.grid.k) kotlin.collections.w.v3(this.f9653b.v().j())) != null && kVar.getIndex() == this.f9654c)) ? a4.G(this.f9653b, this.f9655d, this.f9656e, this.f9657f) : kotlin.collections.j0.f74919b);
                    }

                    @Override // ld.l
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                        a(zVar);
                        return kotlin.k2.f75408a;
                    }
                }

                /* compiled from: DatePicker.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.a4$o0$b$a$b, reason: collision with other inner class name */
                static final class C0208b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ld.l<Integer, kotlin.k2> f9658b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ int f9659c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0208b(ld.l<? super Integer, kotlin.k2> lVar, int i4) {
                        super(0);
                        this.f9658b = lVar;
                        this.f9659c = i4;
                    }

                    public final void a() {
                        this.f9658b.invoke(Integer.valueOf(this.f9659c));
                    }

                    @Override // ld.a
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                        a();
                        return kotlin.k2.f75408a;
                    }
                }

                /* compiled from: DatePicker.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
                static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ String f9660b;

                    /* compiled from: DatePicker.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.a4$o0$b$a$c$a, reason: collision with other inner class name */
                    static final class C0209a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                        /* renamed from: b, reason: collision with root package name */
                        public static final C0209a f9661b = new C0209a(1);

                        C0209a() {
                            super(1);
                        }

                        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                        }

                        @Override // ld.l
                        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                            return kotlin.k2.f75408a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(String str) {
                        super(2);
                        this.f9660b = str;
                    }

                    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.i
                    public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                        if ((i4 & 3) == 2 && tVar.p()) {
                            tVar.d0();
                            return;
                        }
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.r0(882189459, i4, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2062)");
                        }
                        String str = this.f9660b;
                        androidx.compose.ui.q c5 = androidx.compose.ui.semantics.o.c(androidx.compose.ui.q.INSTANCE, C0209a.f9661b);
                        androidx.compose.ui.text.style.j.INSTANCE.getClass();
                        xa.c(str, c5, 0L, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f21356e), 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 130556);
                        if (androidx.compose.runtime.x.b0()) {
                            androidx.compose.runtime.x.q0();
                        }
                    }

                    @Override // ld.p
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                        a(tVar, num.intValue());
                        return kotlin.k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(kotlin.ranges.l lVar, androidx.compose.foundation.lazy.grid.k0 k0Var, kotlinx.coroutines.r0 r0Var, String str, String str2, int i4, int i5, ld.l<? super Integer, kotlin.k2> lVar2, s8 s8Var, u3 u3Var) {
                    super(4);
                    this.f9643b = lVar;
                    this.f9644c = k0Var;
                    this.f9645d = r0Var;
                    this.f9646e = str;
                    this.f9647f = str2;
                    this.f9648g = i4;
                    this.f9649h = i5;
                    this.f9650i = lVar2;
                    this.f9651j = s8Var;
                    this.f9652k = u3Var;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.l androidx.compose.foundation.lazy.grid.q qVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
                    int i6;
                    if ((i5 & 48) == 0) {
                        i6 = i5 | (tVar.f(i4) ? 32 : 16);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 145) == 144 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(1040623618, i6, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2029)");
                    }
                    int first = this.f9643b.getFirst() + i4;
                    String d5 = androidx.compose.material3.b.d(first, 0, 0, false, 7, null);
                    q.Companion companion = androidx.compose.ui.q.INSTANCE;
                    c0.j jVar = c0.j.f37473a;
                    androidx.compose.ui.q q4 = androidx.compose.foundation.layout.c2.q(companion, jVar.K(), jVar.J());
                    tVar.P(-1669466775);
                    boolean q02 = ((i6 & 112) == 32) | tVar.q0(this.f9644c) | tVar.S(this.f9645d) | tVar.q0(this.f9646e) | tVar.q0(this.f9647f);
                    androidx.compose.foundation.lazy.grid.k0 k0Var = this.f9644c;
                    kotlinx.coroutines.r0 r0Var = this.f9645d;
                    String str = this.f9646e;
                    String str2 = this.f9647f;
                    Object Q = tVar.Q();
                    if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                        Q = new C0207a(k0Var, i4, r0Var, str, str2);
                        tVar.E(Q);
                    }
                    tVar.p0();
                    androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(q4, false, (ld.l) Q, 1, null);
                    boolean z4 = first == this.f9648g;
                    boolean z5 = first == this.f9649h;
                    tVar.P(-1669465643);
                    boolean q03 = tVar.q0(this.f9650i) | tVar.f(first);
                    ld.l<Integer, kotlin.k2> lVar = this.f9650i;
                    Object Q2 = tVar.Q();
                    if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                        Q2 = new C0208b(lVar, first);
                        tVar.E(Q2);
                    }
                    ld.a aVar = (ld.a) Q2;
                    tVar.p0();
                    boolean a5 = this.f9651j.a(first);
                    t9.Companion companion2 = t9.INSTANCE;
                    a4.p(f4, z4, z5, aVar, a5, s3.a(new Object[]{d5}, 1, v9.a(x7.a.f15608p, tVar, 0), "format(this, *args)"), this.f9652k, androidx.compose.runtime.internal.c.b(tVar, 882189459, true, new c(d5)), tVar, 12582912);
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.r
                public /* bridge */ /* synthetic */ kotlin.k2 i(androidx.compose.foundation.lazy.grid.q qVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
                    a(qVar, num.intValue(), tVar, num2.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlin.ranges.l lVar, androidx.compose.foundation.lazy.grid.k0 k0Var, kotlinx.coroutines.r0 r0Var, String str, String str2, int i4, int i5, ld.l<? super Integer, kotlin.k2> lVar2, s8 s8Var, u3 u3Var) {
                super(1);
                this.f9633b = lVar;
                this.f9634c = k0Var;
                this.f9635d = r0Var;
                this.f9636e = str;
                this.f9637f = str2;
                this.f9638g = i4;
                this.f9639h = i5;
                this.f9640i = lVar2;
                this.f9641j = s8Var;
                this.f9642k = u3Var;
            }

            public final void a(@fg.l androidx.compose.foundation.lazy.grid.c0 c0Var) {
                androidx.compose.foundation.lazy.grid.c0.f(c0Var, kotlin.collections.w.X1(this.f9633b), null, null, null, new androidx.compose.runtime.internal.b(1040623618, true, new a(this.f9633b, this.f9634c, this.f9635d, this.f9636e, this.f9637f, this.f9638g, this.f9639h, this.f9640i, this.f9641j, this.f9642k)), 14, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.lazy.grid.c0 c0Var) {
                a(c0Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o0(androidx.compose.material3.s0 s0Var, long j4, kotlin.ranges.l lVar, u3 u3Var, androidx.compose.ui.q qVar, ld.l<? super Integer, kotlin.k2> lVar2, s8 s8Var) {
            super(2);
            this.f9623b = s0Var;
            this.f9624c = j4;
            this.f9625d = lVar;
            this.f9626e = u3Var;
            this.f9627f = qVar;
            this.f9628g = lVar2;
            this.f9629h = s8Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            androidx.compose.foundation.lazy.grid.k0 k0Var;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1301915789, i4, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1997)");
            }
            androidx.compose.material3.s0 s0Var = this.f9623b;
            int n4 = s0Var.o(s0Var.p()).n();
            int n5 = this.f9623b.n(this.f9624c).n();
            androidx.compose.foundation.lazy.grid.k0 b5 = androidx.compose.foundation.lazy.grid.l0.b(Math.max(0, (n5 - this.f9625d.getFirst()) - 3), 0, tVar, 0, 2);
            long a5 = b3.a(p6.f13227a.a(tVar, 6), this.f9626e.getContainerColor(), ((androidx.compose.ui.unit.h) tVar.x(x9.g())).u(), tVar, 0);
            Object a6 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a6 == companion.a()) {
                a6 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a6).getCoroutineScope();
            tVar.p0();
            t9.Companion companion2 = t9.INSTANCE;
            String a7 = v9.a(x7.a.f15610r, tVar, 0);
            String a8 = v9.a(x7.a.f15611s, tVar, 0);
            a.b bVar = new a.b(3);
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(androidx.compose.foundation.n.d(this.f9627f, a5, null, 2, null), false, a.f9630b, 1, null);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            i.f n6 = iVar.n();
            i.f z4 = iVar.z(a4.f9467g);
            tVar.P(-969328877);
            boolean S = tVar.S(this.f9625d) | tVar.q0(b5) | tVar.S(coroutineScope) | tVar.q0(a7) | tVar.q0(a8) | tVar.f(n5) | tVar.f(n4) | tVar.q0(this.f9628g) | tVar.q0(this.f9629h) | tVar.q0(this.f9626e);
            kotlin.ranges.l lVar = this.f9625d;
            ld.l<Integer, kotlin.k2> lVar2 = this.f9628g;
            s8 s8Var = this.f9629h;
            u3 u3Var = this.f9626e;
            Object Q = tVar.Q();
            if (S || Q == companion.a()) {
                k0Var = b5;
                Q = new b(lVar, b5, coroutineScope, a7, a8, n5, n4, lVar2, s8Var, u3Var);
                tVar.E(Q);
            } else {
                k0Var = b5;
            }
            tVar.p0();
            androidx.compose.foundation.lazy.grid.h.b(bVar, f4, k0Var, null, false, z4, n6, null, false, (ld.l) Q, tVar, 1769472, HttpStatus.SC_REQUEST_TIMEOUT);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9663c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f9664d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f9665e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f9666f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9667g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9668h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, long j4, long j5, float f4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, int i4) {
            super(2);
            this.f9662b = qVar;
            this.f9663c = pVar;
            this.f9664d = j4;
            this.f9665e = j5;
            this.f9666f = f4;
            this.f9667g = pVar2;
            this.f9668h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.f(this.f9662b, this.f9663c, this.f9664d, this.f9665e, this.f9666f, this.f9667g, tVar, androidx.compose.runtime.g3.b(this.f9668h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9670c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Integer, kotlin.k2> f9671d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s8 f9672e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9673f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9674g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u3 f9675h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f9676i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p0(androidx.compose.ui.q qVar, long j4, ld.l<? super Integer, kotlin.k2> lVar, s8 s8Var, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar2, u3 u3Var, int i4) {
            super(2);
            this.f9669b = qVar;
            this.f9670c = j4;
            this.f9671d = lVar;
            this.f9672e = s8Var;
            this.f9673f = s0Var;
            this.f9674g = lVar2;
            this.f9675h = u3Var;
            this.f9676i = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.q(this.f9669b, this.f9670c, this.f9671d, this.f9672e, this.f9673f, this.f9674g, this.f9675h, tVar, androidx.compose.runtime.g3.b(this.f9676i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f9677b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.s1(zVar, new androidx.compose.ui.text.e(this.f9677b, null, null, 6, null));
            androidx.compose.ui.semantics.i.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.l1(zVar, androidx.compose.ui.semantics.i.f20309c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/x1;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,2268:1\n71#2:2269\n69#2:2270\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPickerMenuButton$1\n*L\n2208#1:2269\n2210#1:2270\n*E\n"})
    static final class q0 extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9678b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q0(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4) {
            super(3);
            this.f9678b = pVar;
            this.f9679c = z4;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.foundation.layout.x1 x1Var, androidx.compose.runtime.t tVar, Integer num) {
            a(x1Var, tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.foundation.layout.x1 x1Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            String a5;
            if ((i4 & 17) == 16 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1899012021, i4, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2202)");
            }
            this.f9678b.invoke(tVar, 0);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.w(companion, androidx.compose.material3.o0.f12901a.t()), tVar, 6);
            androidx.compose.ui.graphics.vector.d a6 = x.f.a(a.b.f89546a);
            if (this.f9679c) {
                tVar.P(1071201785);
                t9.Companion companion2 = t9.INSTANCE;
                a5 = v9.a(x7.a.f15613u, tVar, 0);
                tVar.p0();
            } else {
                tVar.P(1071201872);
                t9.Companion companion3 = t9.INSTANCE;
                a5 = v9.a(x7.a.f15617y, tVar, 0);
                tVar.p0();
            }
            v5.c(a6, a5, androidx.compose.ui.draw.r.a(companion, this.f9679c ? 180.0f : 0.0f), 0L, tVar, 0, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Day$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n69#2,5:2269\n74#2:2302\n78#2:2307\n78#3,11:2274\n91#3:2306\n456#4,8:2285\n464#4,3:2299\n467#4,3:2303\n3737#5,6:2293\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Day$2\n*L\n1972#1:2269,5\n1972#1:2302\n1972#1:2307\n1972#1:2274,11\n1972#1:2306\n1972#1:2285,8\n1972#1:2299,3\n1972#1:2303,3\n1972#1:2293,6\n*E\n"})
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9680b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f9680b = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2031780827, i4, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1971)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            c0.j jVar = c0.j.f37473a;
            androidx.compose.ui.q q4 = androidx.compose.foundation.layout.c2.q(companion, jVar.o(), jVar.m());
            androidx.compose.ui.c i5 = androidx.compose.ui.c.INSTANCE.i();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9680b;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 i6 = androidx.compose.foundation.layout.m.i(i5, false, tVar, 6);
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(q4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a5);
            } else {
                tVar.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, tVar, i6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9681b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9683d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9684e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9685f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9686g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r0(ld.a<kotlin.k2> aVar, boolean z4, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f9681b = aVar;
            this.f9682c = z4;
            this.f9683d = qVar;
            this.f9684e = pVar;
            this.f9685f = i4;
            this.f9686g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.r(this.f9681b, this.f9682c, this.f9683d, this.f9684e, tVar, androidx.compose.runtime.g3.b(this.f9685f | 1), this.f9686g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9687b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9688c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9689d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f9690e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f9691f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f9692g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9693h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9694i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9695j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9696k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f9697l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(androidx.compose.ui.q qVar, boolean z4, ld.a<kotlin.k2> aVar, boolean z5, boolean z6, boolean z7, boolean z10, String str, u3 u3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f9687b = qVar;
            this.f9688c = z4;
            this.f9689d = aVar;
            this.f9690e = z5;
            this.f9691f = z6;
            this.f9692g = z7;
            this.f9693h = z10;
            this.f9694i = str;
            this.f9695j = u3Var;
            this.f9696k = pVar;
            this.f9697l = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.i(this.f9687b, this.f9688c, this.f9689d, this.f9690e, this.f9691f, this.f9692g, this.f9693h, this.f9694i, this.f9695j, this.f9696k, tVar, androidx.compose.runtime.g3.b(this.f9697l | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class s0 extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9699c;

        /* compiled from: DatePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", f = "DatePicker.kt", i = {}, l = {2238}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9700b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9701c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.grid.k0 k0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9701c = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9701c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9700b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.lazy.grid.k0 k0Var = this.f9701c;
                    int r4 = k0Var.r() + 3;
                    this.f9700b = 1;
                    if (androidx.compose.foundation.lazy.grid.k0.P(k0Var, r4, 0, this, 2, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(androidx.compose.foundation.lazy.grid.k0 k0Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f9698b = k0Var;
            this.f9699c = r0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            if (this.f9698b.a()) {
                kotlinx.coroutines.k.f(this.f9699c, null, null, new a(this.f9698b, null), 3, null);
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<p4, kotlin.k2> f9702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(ld.l<? super p4, kotlin.k2> lVar) {
            super(0);
            this.f9702b = lVar;
        }

        public final void a() {
            ld.l<p4, kotlin.k2> lVar = this.f9702b;
            p4.INSTANCE.getClass();
            lVar.invoke(p4.c(p4.f13207d));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class t0 extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9703b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9704c;

        /* compiled from: DatePicker.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", f = "DatePicker.kt", i = {}, l = {2228}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9705b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.grid.k0 f9706c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.lazy.grid.k0 k0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9706c = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9706c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9705b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.lazy.grid.k0 k0Var = this.f9706c;
                    int r4 = k0Var.r() - 3;
                    this.f9705b = 1;
                    if (androidx.compose.foundation.lazy.grid.k0.P(k0Var, r4, 0, this, 2, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(androidx.compose.foundation.lazy.grid.k0 k0Var, kotlinx.coroutines.r0 r0Var) {
            super(0);
            this.f9703b = k0Var;
            this.f9704c = r0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z4;
            if (this.f9703b.e()) {
                kotlinx.coroutines.k.f(this.f9704c, null, null, new a(this.f9703b, null), 3, null);
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<p4, kotlin.k2> f9707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(ld.l<? super p4, kotlin.k2> lVar) {
            super(0);
            this.f9707b = lVar;
        }

        public final void a() {
            ld.l<p4, kotlin.k2> lVar = this.f9707b;
            p4.INSTANCE.getClass();
            lVar.invoke(p4.c(p4.f13206c));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/c4;", "a", "()Landroidx/compose/material3/c4;"}, k = 3, mv = {1, 8, 0})
    static final class u0 extends kotlin.jvm.internal.n0 implements ld.a<c4> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f9708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f9709c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9710d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9711e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s8 f9712f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Locale f9713g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(Long l4, Long l5, kotlin.ranges.l lVar, int i4, s8 s8Var, Locale locale) {
            super(0);
            this.f9708b = l4;
            this.f9709c = l5;
            this.f9710d = lVar;
            this.f9711e = i4;
            this.f9712f = s8Var;
            this.f9713g = locale;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4 invoke() {
            return new c4(this.f9708b, this.f9709c, this.f9710d, this.f9711e, this.f9712f, this.f9713g, null);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9715c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<p4, kotlin.k2> f9716d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9717e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(androidx.compose.ui.q qVar, int i4, ld.l<? super p4, kotlin.k2> lVar, int i5) {
            super(2);
            this.f9714b = qVar;
            this.f9715c = i4;
            this.f9716d = lVar;
            this.f9717e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.j(this.f9714b, this.f9715c, this.f9716d, tVar, androidx.compose.runtime.g3.b(this.f9717e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class v0 extends kotlin.jvm.internal.n0 implements ld.a<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9718b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v0(androidx.compose.foundation.lazy.c0 c0Var) {
            super(0);
            this.f9718b = c0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f9718b.u());
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2268:1\n1116#2,6:2269\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1\n*L\n1663#1:2269,6\n*E\n"})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9719b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9720c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9721d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j2 f9722e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9723f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.r0 f9724g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Long f9725h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x3 f9726i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ s8 f9727j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ u3 f9728k;

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9729b = new a(1);

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.a4$w$a$a, reason: collision with other inner class name */
            static final class C0210a extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0210a f9730b = new C0210a(0);

                C0210a() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<Float> {

                /* renamed from: b, reason: collision with root package name */
                public static final b f9731b = new b(0);

                b() {
                    super(0);
                }

                @fg.l
                public final Float a() {
                    return Float.valueOf(0.0f);
                }

                @Override // ld.a
                public Float invoke() {
                    return Float.valueOf(0.0f);
                }
            }

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.e1(zVar, new androidx.compose.ui.semantics.j(C0210a.f9730b, b.f9731b, false, 4, null));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                a(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: DatePicker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.lazy.y, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.ranges.l f9732b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.s0 f9733c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ j2 f9734d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.l<Long, kotlin.k2> f9735e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.r0 f9736f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Long f9737g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ x3 f9738h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ s8 f9739i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ u3 f9740j;

            /* compiled from: DatePicker.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/b;", "", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/lazy/b;ILandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2268:1\n68#2,6:2269\n74#2:2303\n78#2:2308\n78#3,11:2275\n91#3:2307\n456#4,8:2286\n464#4,3:2300\n467#4,3:2304\n3737#5,6:2294\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$HorizontalMonthsList$1$2$1$1\n*L\n1669#1:2269,6\n1669#1:2303\n1669#1:2308\n1669#1:2275,11\n1669#1:2307\n1669#1:2286,8\n1669#1:2300,3\n1669#1:2304,3\n1669#1:2294,6\n*E\n"})
            static final class a extends kotlin.jvm.internal.n0 implements ld.r<androidx.compose.foundation.lazy.b, Integer, androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.s0 f9741b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j2 f9742c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ld.l<Long, kotlin.k2> f9743d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.material3.r0 f9744e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Long f9745f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ x3 f9746g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ s8 f9747h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ u3 f9748i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(androidx.compose.material3.s0 s0Var, j2 j2Var, ld.l<? super Long, kotlin.k2> lVar, androidx.compose.material3.r0 r0Var, Long l4, x3 x3Var, s8 s8Var, u3 u3Var) {
                    super(4);
                    this.f9741b = s0Var;
                    this.f9742c = j2Var;
                    this.f9743d = lVar;
                    this.f9744e = r0Var;
                    this.f9745f = l4;
                    this.f9746g = x3Var;
                    this.f9747h = s8Var;
                    this.f9748i = u3Var;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.l androidx.compose.foundation.lazy.b bVar, int i4, @fg.m androidx.compose.runtime.t tVar, int i5) {
                    int i6;
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (tVar.q0(bVar) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i6 |= tVar.f(i4) ? 32 : 16;
                    }
                    if ((i6 & 147) == 146 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(1137566309, i6, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1664)");
                    }
                    j2 t4 = this.f9741b.t(this.f9742c, i4);
                    androidx.compose.ui.q b5 = androidx.compose.foundation.lazy.b.b(bVar, androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
                    ld.l<Long, kotlin.k2> lVar = this.f9743d;
                    androidx.compose.material3.r0 r0Var = this.f9744e;
                    Long l4 = this.f9745f;
                    x3 x3Var = this.f9746g;
                    s8 s8Var = this.f9747h;
                    u3 u3Var = this.f9748i;
                    tVar.P(733328855);
                    androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                    int j4 = androidx.compose.runtime.p.j(tVar, 0);
                    androidx.compose.runtime.g0 B = tVar.B();
                    g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                    ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                    ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(b5);
                    if (tVar.s() == null) {
                        androidx.compose.runtime.p.n();
                    }
                    tVar.W();
                    if (tVar.getInserting()) {
                        tVar.F(a6);
                    } else {
                        tVar.C();
                    }
                    ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                    if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                        androidx.compose.animation.d.a(j4, tVar, j4, a7);
                    }
                    androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                    androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
                    a4.l(t4, lVar, r0Var.k(), l4, null, null, x3Var, s8Var, u3Var, tVar, 221184);
                    if (androidx.compose.material3.t.a(tVar)) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.r
                public /* bridge */ /* synthetic */ kotlin.k2 i(androidx.compose.foundation.lazy.b bVar, Integer num, androidx.compose.runtime.t tVar, Integer num2) {
                    a(bVar, num.intValue(), tVar, num2.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlin.ranges.l lVar, androidx.compose.material3.s0 s0Var, j2 j2Var, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.r0 r0Var, Long l4, x3 x3Var, s8 s8Var, u3 u3Var) {
                super(1);
                this.f9732b = lVar;
                this.f9733c = s0Var;
                this.f9734d = j2Var;
                this.f9735e = lVar2;
                this.f9736f = r0Var;
                this.f9737g = l4;
                this.f9738h = x3Var;
                this.f9739i = s8Var;
                this.f9740j = u3Var;
            }

            public final void a(@fg.l androidx.compose.foundation.lazy.y yVar) {
                androidx.compose.foundation.lazy.y.h(yVar, a4.M(this.f9732b), null, null, new androidx.compose.runtime.internal.b(1137566309, true, new a(this.f9733c, this.f9734d, this.f9735e, this.f9736f, this.f9737g, this.f9738h, this.f9739i, this.f9740j)), 6, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.lazy.y yVar) {
                a(yVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(androidx.compose.foundation.lazy.c0 c0Var, kotlin.ranges.l lVar, androidx.compose.material3.s0 s0Var, j2 j2Var, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.r0 r0Var, Long l4, x3 x3Var, s8 s8Var, u3 u3Var) {
            super(2);
            this.f9719b = c0Var;
            this.f9720c = lVar;
            this.f9721d = s0Var;
            this.f9722e = j2Var;
            this.f9723f = lVar2;
            this.f9724g = r0Var;
            this.f9725h = l4;
            this.f9726i = x3Var;
            this.f9727j = s8Var;
            this.f9728k = u3Var;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
              (r1v14 ?? I:java.lang.Object) from 0x00b4: INVOKE (r22v0 ?? I:androidx.compose.runtime.t), (r1v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
              (r1v14 ?? I:java.lang.Object) from 0x00b4: INVOKE (r22v0 ?? I:androidx.compose.runtime.t), (r1v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.t.E(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:181)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(ILkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class w0<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9752e;

        /* JADX WARN: Multi-variable type inference failed */
        w0(androidx.compose.foundation.lazy.c0 c0Var, ld.l<? super Long, kotlin.k2> lVar, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar2) {
            this.f9749b = c0Var;
            this.f9750c = lVar;
            this.f9751d = s0Var;
            this.f9752e = lVar2;
        }

        @fg.m
        public final Object a(int i4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
            int u4 = this.f9749b.u() / 12;
            this.f9750c.invoke(new Long(this.f9751d.m(this.f9752e.getFirst() + u4, (this.f9749b.u() % 12) + 1).m()));
            return kotlin.k2.f75408a;
        }

        @Override // kotlinx.coroutines.flow.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Number) obj).intValue(), dVar);
        }
    }

    /* compiled from: DatePicker.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", i = {}, l = {1689}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class x extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9753b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9754c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9755d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9756e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9757f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(androidx.compose.foundation.lazy.c0 c0Var, ld.l<? super Long, kotlin.k2> lVar, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar2, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f9754c = c0Var;
            this.f9755d = lVar;
            this.f9756e = s0Var;
            this.f9757f = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new x(this.f9754c, this.f9755d, this.f9756e, this.f9757f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9753b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.lazy.c0 c0Var = this.f9754c;
                ld.l<Long, kotlin.k2> lVar = this.f9755d;
                androidx.compose.material3.s0 s0Var = this.f9756e;
                kotlin.ranges.l lVar2 = this.f9757f;
                this.f9753b = 1;
                if (a4.O(c0Var, lVar, s0Var, lVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((x) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class y extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.c0 f9758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f9759c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9760d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9761e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.s0 f9762f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.l f9763g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ x3 f9764h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ s8 f9765i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ u3 f9766j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f9767k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(androidx.compose.foundation.lazy.c0 c0Var, Long l4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, int i4) {
            super(2);
            this.f9758b = c0Var;
            this.f9759c = l4;
            this.f9760d = lVar;
            this.f9761e = lVar2;
            this.f9762f = s0Var;
            this.f9763g = lVar3;
            this.f9764h = x3Var;
            this.f9765i = s8Var;
            this.f9766j = u3Var;
            this.f9767k = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a4.k(this.f9758b, this.f9759c, this.f9760d, this.f9761e, this.f9762f, this.f9763g, this.f9764h, this.f9765i, this.f9766j, tVar, androidx.compose.runtime.g3.b(this.f9767k | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Long, kotlin.k2> f9768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(ld.l<? super Long, kotlin.k2> lVar, long j4) {
            super(0);
            this.f9768b = lVar;
            this.f9769c = j4;
        }

        public final void a() {
            this.f9768b.invoke(Long.valueOf(this.f9769c));
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 12;
        f9463c = f4;
        f9464d = androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, f4, f4, 3, null);
        float f5 = 24;
        float f6 = 16;
        f9465e = androidx.compose.foundation.layout.j1.e(f5, f6, f4, 0.0f, 8, null);
        f9466f = androidx.compose.foundation.layout.j1.e(f5, 0.0f, f4, f4, 2, null);
        f9467g = f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<androidx.compose.ui.semantics.e> G(androidx.compose.foundation.lazy.grid.k0 k0Var, kotlinx.coroutines.r0 r0Var, String str, String str2) {
        return kotlin.collections.w.O(new androidx.compose.ui.semantics.e(str, new t0(k0Var, r0Var)), new androidx.compose.ui.semantics.e(str2, new s0(k0Var, r0Var)));
    }

    @androidx.compose.runtime.i
    private static final String H(boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(502032503);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(502032503, i4, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1900)");
        }
        StringBuilder sb = new StringBuilder();
        tVar.P(-852185051);
        if (z4) {
            if (z6) {
                tVar.P(-852184961);
                t9.Companion companion = t9.INSTANCE;
                sb.append(v9.a(x7.a.I, tVar, 0));
                tVar.p0();
            } else if (z7) {
                tVar.P(-852184821);
                t9.Companion companion2 = t9.INSTANCE;
                sb.append(v9.a(x7.a.F, tVar, 0));
                tVar.p0();
            } else if (z10) {
                tVar.P(-852184683);
                t9.Companion companion3 = t9.INSTANCE;
                sb.append(v9.a(x7.a.E, tVar, 0));
                tVar.p0();
            } else {
                tVar.P(-852184582);
                tVar.p0();
            }
        }
        tVar.p0();
        if (z5) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            t9.Companion companion4 = t9.INSTANCE;
            sb.append(v9.a(x7.a.A, tVar, 0));
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return sb2;
    }

    public static final float I() {
        return f9463c;
    }

    @fg.l
    public static final androidx.compose.foundation.layout.l1 J() {
        return f9464d;
    }

    public static final float K() {
        return f9462b;
    }

    public static final float L() {
        return f9461a;
    }

    public static final int M(@fg.l kotlin.ranges.l lVar) {
        return ((lVar.getLast() - lVar.getFirst()) + 1) * 12;
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final b4 N(@fg.m Long l4, @fg.m Long l5, @fg.m kotlin.ranges.l lVar, int i4, @fg.m s8 s8Var, @fg.m androidx.compose.runtime.t tVar, int i5, int i6) {
        int i7;
        tVar.P(2065763010);
        Long l6 = (i6 & 1) != 0 ? null : l4;
        Long l7 = (i6 & 2) != 0 ? l6 : l5;
        kotlin.ranges.l k4 = (i6 & 4) != 0 ? v3.f15005a.k() : lVar;
        if ((i6 & 8) != 0) {
            p4.INSTANCE.getClass();
            i7 = p4.f13206c;
        } else {
            i7 = i4;
        }
        s8 g4 = (i6 & 16) != 0 ? v3.f15005a.g() : s8Var;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(2065763010, i5, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:363)");
        }
        Locale a5 = androidx.compose.material3.a.a(tVar, 0);
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.l<c4, Object> a6 = c4.INSTANCE.a(g4, a5);
        tVar.P(-1398082866);
        boolean S = ((((i5 & 14) ^ 6) > 4 && tVar.q0(l6)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && tVar.q0(l7)) || (i5 & 48) == 32) | tVar.S(k4) | ((((i5 & 7168) ^ 3072) > 2048 && tVar.f(i7)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && tVar.q0(g4)) || (i5 & 24576) == 16384) | tVar.S(a5);
        Object Q = tVar.Q();
        if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new u0(l6, l7, k4, i7, g4, a5);
            tVar.E(Q);
        }
        tVar.p0();
        c4 c4Var = (c4) androidx.compose.runtime.saveable.d.d(objArr, a6, null, (ld.a) Q, tVar, 0, 4);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c4Var;
    }

    @fg.m
    public static final Object O(@fg.l androidx.compose.foundation.lazy.c0 c0Var, @fg.l ld.l<? super Long, kotlin.k2> lVar, @fg.l androidx.compose.material3.s0 s0Var, @fg.l kotlin.ranges.l lVar2, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object a5 = androidx.compose.runtime.o4.w(new v0(c0Var)).a(new w0(c0Var, lVar, s0Var, lVar2), dVar);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : kotlin.k2.f75408a;
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.q qVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, @fg.l u3 u3Var, @fg.l androidx.compose.ui.text.v0 v0Var, float f4, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1507356255);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.q0(u3Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.q0(v0Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.d(f4) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.S(pVar4) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) == 4793490 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1507356255, i5, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1302)");
            }
            androidx.compose.ui.q f5 = androidx.compose.ui.semantics.o.f(androidx.compose.foundation.layout.c2.A(qVar, c0.j.f37473a.f(), 0.0f, 0.0f, 0.0f, 14, null), false, a.f9470b, 1, null);
            o4.P(-483455358);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(androidx.compose.ui.c.INSTANCE, androidx.compose.foundation.layout.i.f5073a.r(), o4, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(f5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, o4, a5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            f(androidx.compose.ui.q.INSTANCE, pVar, u3Var.getTitleContentColor(), u3Var.getHeadlineContentColor(), f4, androidx.compose.runtime.internal.c.b(o4, -229007058, true, new b(pVar2, pVar3, pVar, u3Var, v0Var)), o4, (i5 & 112) | 196614 | (57344 & (i5 >> 6)));
            if (androidx.compose.foundation.x.a((i5 >> 21) & 14, pVar4, o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(qVar, pVar, pVar2, pVar3, u3Var, v0Var, f4, pVar4, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c9  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.material3.b4 r24, @fg.m androidx.compose.ui.q r25, @fg.m androidx.compose.material3.x3 r26, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r28, boolean r29, @fg.m androidx.compose.material3.u3 r30, @fg.m androidx.compose.runtime.t r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.a4.b(androidx.compose.material3.b4, androidx.compose.ui.q, androidx.compose.material3.x3, ld.p, ld.p, boolean, androidx.compose.material3.u3, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void c(Long l4, long j4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-434467002);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(l4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(lVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(s0Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= (2097152 & i4) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-434467002, i6, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1477)");
            }
            j2 n4 = s0Var.n(j4);
            androidx.compose.foundation.lazy.c0 c5 = androidx.compose.foundation.lazy.d0.c(n4.o(lVar3), 0, o4, 0, 2);
            Object a5 = androidx.compose.foundation.j.a(o4, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, o4), o4);
            }
            o4.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            o4.p0();
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) androidx.compose.runtime.saveable.d.d(new Object[0], null, null, n.f9612b, o4, 3072, 6);
            Locale a6 = androidx.compose.material3.a.a(o4, 0);
            o4.P(-483455358);
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            i.m r4 = iVar.r();
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a7 = androidx.compose.material3.d.a(companion3, r4, o4, 0, -1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion4 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a8 = companion4.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion2);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a8);
            } else {
                o4.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion4, o4, a7, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a10);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            float f4 = f9463c;
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(companion2, f4, 0.0f, 2, null);
            boolean a11 = c5.a();
            boolean e4 = c5.e();
            boolean d5 = d(k2Var);
            String b5 = x3Var.b(Long.valueOf(j4), a6);
            if (b5 == null) {
                b5 = "-";
            }
            String str = b5;
            o4.P(-269656881);
            boolean S = o4.S(coroutineScope) | o4.q0(c5);
            Object Q = o4.Q();
            if (S || Q == companion.a()) {
                Q = new i(coroutineScope, c5);
                o4.E(Q);
            }
            ld.a aVar = (ld.a) Q;
            o4.p0();
            o4.P(-269656336);
            boolean S2 = o4.S(coroutineScope) | o4.q0(c5);
            Object Q2 = o4.Q();
            if (S2 || Q2 == companion.a()) {
                Q2 = new j(coroutineScope, c5);
                o4.E(Q2);
            }
            ld.a aVar2 = (ld.a) Q2;
            o4.p0();
            o4.P(-269655774);
            boolean q02 = o4.q0(k2Var);
            Object Q3 = o4.Q();
            if (q02 || Q3 == companion.a()) {
                Q3 = new k(k2Var);
                o4.E(Q3);
            }
            o4.p0();
            int i7 = i6 & 234881024;
            m(m4, a11, e4, d5, str, aVar, aVar2, (ld.a) Q3, u3Var, o4, i7 | 6);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j6 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a13 = companion4.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(companion2);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a13);
            } else {
                o4.C();
            }
            ld.p a14 = androidx.compose.animation.p.a(companion4, o4, a12, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, o4, j6, a14);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.ui.q m5 = androidx.compose.foundation.layout.j1.m(companion2, f4, 0.0f, 2, null);
            o4.P(-483455358);
            androidx.compose.ui.layout.m0 a15 = androidx.compose.material3.d.a(companion3, iVar.r(), o4, 0, -1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B3 = o4.B();
            ld.a<androidx.compose.ui.node.g> a16 = companion4.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(m5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a16);
            } else {
                o4.C();
            }
            ld.p a17 = androidx.compose.animation.p.a(companion4, o4, a15, o4, B3);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a17);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            o(u3Var, s0Var, o4, ((i6 >> 24) & 14) | ((i6 >> 9) & 112));
            k(c5, l4, lVar, lVar2, s0Var, lVar3, x3Var, s8Var, u3Var, o4, ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (i6 & 29360128) | i7);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            tVar2 = o4;
            androidx.compose.animation.q.j(d(k2Var), androidx.compose.ui.draw.h.b(companion2), androidx.compose.animation.d0.o(null, null, false, null, 15, null).c(androidx.compose.animation.d0.q(null, 0.6f, 1, null)), androidx.compose.animation.d0.E(null, null, false, null, 15, null).d(androidx.compose.animation.d0.s(null, 0.0f, 3, null)), null, androidx.compose.runtime.internal.c.b(tVar2, 1193716082, true, new l(j4, k2Var, coroutineScope, c5, lVar3, n4, s8Var, s0Var, u3Var)), tVar2, 200112, 16);
            tVar2.p0();
            tVar2.H();
            tVar2.p0();
            tVar2.p0();
            tVar2.p0();
            tVar2.H();
            tVar2.p0();
            tVar2.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new m(l4, j4, lVar, lVar2, s0Var, lVar3, x3Var, s8Var, u3Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.compose.runtime.k2<Boolean> k2Var) {
        return k2Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.k2<Boolean> k2Var, boolean z4) {
        k2Var.setValue(Boolean.valueOf(z4));
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void f(@fg.l androidx.compose.ui.q qVar, @fg.m ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, long j4, long j5, float f4, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-996037719);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j4) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.g(j5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.d(f4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(pVar2) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-996037719, i5, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1592)");
            }
            androidx.compose.ui.q w32 = androidx.compose.foundation.layout.c2.h(qVar, 0.0f, 1, null).w3(pVar != null ? androidx.compose.foundation.layout.c2.b(androidx.compose.ui.q.INSTANCE, 0.0f, f4, 1, null) : androidx.compose.ui.q.INSTANCE);
            i.f l4 = androidx.compose.foundation.layout.i.f5073a.l();
            o4.P(-483455358);
            androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(l4, androidx.compose.ui.c.INSTANCE.u(), o4, 6);
            o4.P(-1323940314);
            int j6 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(w32);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, b5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, o4, j6, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            o4.P(1127544336);
            if (pVar != null) {
                w7.a(j4, tb.a(p6.f13227a.c(o4, 6), c0.j.f37473a.y()), androidx.compose.runtime.internal.c.b(o4, 1936268514, true, new o(pVar)), o4, ((i5 >> 6) & 14) | 384);
            }
            o4.p0();
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), pVar2, o4, androidx.compose.runtime.b3.f15974d | ((i5 >> 12) & 112));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p(qVar, pVar, j4, j5, f4, pVar2, i4));
        }
    }

    @fg.l
    @f5
    public static final b4 g(@fg.l Locale locale, @fg.m Long l4, @fg.m Long l5, @fg.l kotlin.ranges.l lVar, int i4, @fg.l s8 s8Var) {
        return new c4(l4, l5, lVar, i4, s8Var, locale, null);
    }

    public static b4 h(Locale locale, Long l4, Long l5, kotlin.ranges.l lVar, int i4, s8 s8Var, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            l4 = null;
        }
        Long l6 = (i5 & 4) != 0 ? l4 : l5;
        if ((i5 & 8) != 0) {
            lVar = v3.f15005a.k();
        }
        kotlin.ranges.l lVar2 = lVar;
        if ((i5 & 16) != 0) {
            p4.INSTANCE.getClass();
            i4 = p4.f13206c;
        }
        int i6 = i4;
        if ((i5 & 32) != 0) {
            s8Var = v3.f15005a.g();
        }
        return g(locale, l4, l6, lVar2, i6, s8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void i(androidx.compose.ui.q qVar, boolean z4, ld.a<kotlin.k2> aVar, boolean z5, boolean z6, boolean z7, boolean z10, String str, u3 u3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-1434777861);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.b(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.b(z5) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.b(z6) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.b(z7) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.b(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.q0(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i5 |= o4.S(pVar) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        int i6 = i5;
        if ((306783379 & i6) == 306783378 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1434777861, i6, -1, "androidx.compose.material3.Day (DatePicker.kt:1937)");
            }
            o4.P(1664739143);
            boolean z11 = (29360128 & i6) == 8388608;
            Object Q = o4.Q();
            if (z11 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new q(str);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.q e4 = androidx.compose.ui.semantics.o.e(qVar, true, (ld.l) Q);
            c0.j jVar = c0.j.f37473a;
            int i7 = i6 >> 3;
            int i10 = i6 >> 15;
            int i11 = i6 >> 12;
            tVar2 = o4;
            x9.b(z4, aVar, e4, z6, x8.e(jVar.h(), o4, 6), u3Var.c(z4, z6, z5, o4, (i10 & 7168) | (i7 & 14) | ((i6 >> 9) & 112) | (i7 & 896)).getValue().M(), u3Var.d(z7, z4, z10, z6, o4, (i10 & 14) | (i6 & 112) | (i11 & 896) | (i7 & 7168) | (i11 & 57344)).getValue().M(), 0.0f, 0.0f, (!z7 || z4) ? null : androidx.compose.foundation.d0.a(jVar.q(), u3Var.getTodayDateBorderColor()), null, androidx.compose.runtime.internal.c.b(o4, -2031780827, true, new r(pVar)), tVar2, i7 & 7294, 48, 1408);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new s(qVar, z4, aVar, z5, z6, z7, z10, str, u3Var, pVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void j(@fg.l androidx.compose.ui.q qVar, int i4, @fg.l ld.l<? super p4, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i5) {
        int i6;
        boolean z4;
        androidx.compose.runtime.t o4 = tVar.o(1393846115);
        if ((i5 & 6) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.f(i4) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1393846115, i6, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1354)");
            }
            p4.INSTANCE.getClass();
            if (p4.f(i4, p4.f13206c)) {
                o4.P(-1814955688);
                o4.P(-1814955657);
                z4 = (i6 & 896) == 256;
                Object Q = o4.Q();
                if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new t(lVar);
                    o4.E(Q);
                }
                o4.p0();
                e3.f10605a.getClass();
                u5.e((ld.a) Q, qVar, false, null, null, e3.f10606b, o4, ((i6 << 3) & 112) | o.c.f32821k, 28);
                o4.p0();
            } else {
                o4.P(-1814955404);
                o4.P(-1814955373);
                z4 = (i6 & 896) == 256;
                Object Q2 = o4.Q();
                if (z4 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new u(lVar);
                    o4.E(Q2);
                }
                o4.p0();
                e3.f10605a.getClass();
                u5.e((ld.a) Q2, qVar, false, null, null, e3.f10607c, o4, ((i6 << 3) & 112) | o.c.f32821k, 28);
                o4.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new v(qVar, i4, lVar, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void k(androidx.compose.foundation.lazy.c0 c0Var, Long l4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-1994757941);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(c0Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(l4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(lVar2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(s0Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= (2097152 & i4) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1994757941, i6, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1640)");
            }
            androidx.compose.material3.r0 p4 = s0Var.p();
            o4.P(1346192500);
            boolean q02 = o4.q0(lVar3);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = s0Var.m(lVar3.getFirst(), 1);
                o4.E(Q);
            }
            o4.p0();
            tVar2 = o4;
            xa.a(tb.a(p6.f13227a.c(o4, 6), c0.j.f37473a.j()), androidx.compose.runtime.internal.c.b(tVar2, 1504086906, true, new w(c0Var, lVar3, s0Var, (j2) Q, lVar, p4, l4, x3Var, s8Var, u3Var)), tVar2, 48);
            tVar2.P(1346194369);
            int i7 = i6 & 14;
            boolean S = (i7 == 4) | ((i6 & 7168) == 2048) | tVar2.S(s0Var) | tVar2.S(lVar3);
            Object Q2 = tVar2.Q();
            if (S || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                x xVar = new x(c0Var, lVar2, s0Var, lVar3, null);
                tVar2.E(xVar);
                Q2 = xVar;
            }
            tVar2.p0();
            androidx.compose.runtime.a1.h(c0Var, (ld.p) Q2, tVar2, i7);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new y(c0Var, l4, lVar, lVar2, s0Var, lVar3, x3Var, s8Var, u3Var, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void l(@fg.l j2 j2Var, @fg.l ld.l<? super Long, kotlin.k2> lVar, long j4, @fg.m Long l4, @fg.m Long l5, @fg.m t8 t8Var, @fg.l x3 x3Var, @fg.l s8 s8Var, @fg.l u3 u3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.ui.q qVar;
        androidx.compose.runtime.t tVar2;
        char c5;
        int i6;
        int i7;
        androidx.compose.runtime.t tVar3;
        Locale locale;
        Object obj;
        boolean z4;
        long j5;
        boolean z5;
        boolean z6;
        Object g4;
        ld.l<? super Long, kotlin.k2> lVar2 = lVar;
        long j6 = j4;
        Object obj2 = l4;
        Object obj3 = l5;
        androidx.compose.runtime.t o4 = tVar.o(-1912870997);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(j2Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(lVar2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.g(j6) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(obj2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.q0(obj3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.q0(t8Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= (2097152 & i4) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.q0(s8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        int i10 = i5;
        if ((38347923 & i10) == 38347922 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1912870997, i10, -1, "androidx.compose.material3.Month (DatePicker.kt:1780)");
            }
            o4.P(-2019459922);
            if (t8Var != null) {
                q.Companion companion = androidx.compose.ui.q.INSTANCE;
                o4.P(-2019459855);
                boolean z7 = ((i10 & 234881024) == 67108864) | ((i10 & 458752) == 131072);
                Object Q = o4.Q();
                if (z7 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new c0(t8Var, u3Var);
                    o4.E(Q);
                }
                o4.p0();
                qVar = androidx.compose.ui.draw.l.d(companion, (ld.l) Q);
            } else {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            o4.p0();
            Locale a5 = androidx.compose.material3.a.a(o4, 0);
            androidx.compose.ui.q w32 = androidx.compose.foundation.layout.c2.l(androidx.compose.ui.q.INSTANCE, androidx.compose.ui.unit.h.g(f9461a * 6)).w3(qVar);
            i.f n4 = androidx.compose.foundation.layout.i.f5073a.n();
            o4.P(-483455358);
            androidx.compose.ui.layout.m0 b5 = androidx.compose.foundation.layout.t.b(n4, androidx.compose.ui.c.INSTANCE.u(), o4, 6);
            o4.P(-1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            Locale locale2 = a5;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(w32);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion2, o4, b5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a7);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            o4.P(-2019459388);
            int i11 = 0;
            int i12 = 0;
            int i13 = 6;
            while (i11 < i13) {
                androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null);
                i.f n5 = androidx.compose.foundation.layout.i.f5073a.n();
                c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
                o4.P(693286680);
                androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(n5, q4, o4, 54);
                o4.P(-1323940314);
                int j10 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B2 = o4.B();
                int i14 = i12;
                g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
                int i15 = i11;
                ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(h4);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a8);
                } else {
                    o4.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion3, o4, d5, o4, B2);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j10))) {
                    androidx.compose.animation.d.a(j10, o4, j10, a10);
                }
                char c6 = 43753;
                androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
                o4.P(-713628297);
                int i16 = 0;
                int i17 = i14;
                while (i16 < 7) {
                    if (i17 >= j2Var.i()) {
                        if (i17 < j2Var.l() + j2Var.i()) {
                            o4.P(-1111235573);
                            int i18 = i17 - j2Var.i();
                            long m4 = (i18 * 86400000) + j2Var.m();
                            boolean z10 = m4 == j6;
                            boolean z11 = obj2 != null && m4 == l4.longValue();
                            boolean z12 = obj3 != null && m4 == l5.longValue();
                            o4.P(-1111235085);
                            if (t8Var != null) {
                                o4.P(-1111235023);
                                boolean g7 = ((i10 & 458752) == 131072) | o4.g(m4);
                                Object Q2 = o4.Q();
                                if (g7 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                                    if (m4 >= (obj2 != null ? l4.longValue() : Long.MAX_VALUE)) {
                                        if (m4 <= (obj3 != null ? l5.longValue() : Long.MIN_VALUE)) {
                                            z6 = true;
                                            obj = null;
                                            g4 = androidx.compose.runtime.t4.g(Boolean.valueOf(z6), null, 2, null);
                                            o4.E(g4);
                                        }
                                    }
                                    z6 = false;
                                    obj = null;
                                    g4 = androidx.compose.runtime.t4.g(Boolean.valueOf(z6), null, 2, null);
                                    o4.E(g4);
                                } else {
                                    g4 = Q2;
                                    obj = null;
                                }
                                o4.p0();
                                z4 = ((Boolean) ((androidx.compose.runtime.k2) g4).getValue()).booleanValue();
                            } else {
                                obj = null;
                                z4 = false;
                            }
                            o4.p0();
                            i6 = i10;
                            i7 = i16;
                            Locale locale3 = locale2;
                            androidx.compose.runtime.t tVar4 = o4;
                            String H = H(t8Var != null, z10, z11, z12, z4, tVar4, 0);
                            String c7 = x3Var.c(Long.valueOf(m4), locale3, true);
                            if (c7 == null) {
                                c7 = "";
                            }
                            q.Companion companion4 = androidx.compose.ui.q.INSTANCE;
                            boolean z13 = z11 || z12;
                            tVar3 = tVar4;
                            tVar3.P(-1111233694);
                            locale = locale3;
                            if ((i6 & 112) == 32) {
                                j5 = m4;
                                z5 = true;
                            } else {
                                j5 = m4;
                                z5 = false;
                            }
                            boolean g10 = z5 | tVar3.g(j5);
                            Object Q3 = tVar3.Q();
                            if (g10 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                                Q3 = new z(lVar2, j5);
                                tVar3.E(Q3);
                            }
                            ld.a aVar = (ld.a) Q3;
                            tVar3.p0();
                            tVar3.P(-1111233319);
                            boolean g11 = tVar3.g(j5);
                            Object Q4 = tVar3.Q();
                            if (g11 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                                Q4 = Boolean.valueOf(s8Var.a(j2Var.n()) && s8Var.b(j5));
                                tVar3.E(Q4);
                            }
                            boolean booleanValue = ((Boolean) Q4).booleanValue();
                            tVar3.p0();
                            c5 = 43753;
                            i(companion4, z13, aVar, z11, booleanValue, z10, z4, H != null ? z3.a(H, ", ", c7) : c7, u3Var, androidx.compose.runtime.internal.c.b(tVar3, -2095706591, true, new a0(i18)), tVar3, (i6 & 234881024) | 805306374);
                            tVar3.p0();
                            i17++;
                            i16 = i7 + 1;
                            lVar2 = lVar;
                            obj2 = l4;
                            obj3 = l5;
                            o4 = tVar3;
                            i10 = i6;
                            locale2 = locale;
                            c6 = c5;
                            j6 = j4;
                        }
                    }
                    c5 = c6;
                    i6 = i10;
                    i7 = i16;
                    tVar3 = o4;
                    locale = locale2;
                    tVar3.P(-1111235936);
                    q.Companion companion5 = androidx.compose.ui.q.INSTANCE;
                    float f4 = f9461a;
                    androidx.compose.foundation.layout.f2.a(androidx.compose.foundation.layout.c2.q(companion5, f4, f4), tVar3, 6);
                    tVar3.p0();
                    i17++;
                    i16 = i7 + 1;
                    lVar2 = lVar;
                    obj2 = l4;
                    obj3 = l5;
                    o4 = tVar3;
                    i10 = i6;
                    locale2 = locale;
                    c6 = c5;
                    j6 = j4;
                }
                androidx.compose.runtime.t tVar5 = o4;
                tVar5.p0();
                tVar5.p0();
                tVar5.H();
                tVar5.p0();
                tVar5.p0();
                obj2 = l4;
                obj3 = l5;
                i13 = 6;
                lVar2 = lVar;
                j6 = j4;
                i12 = i17;
                i11 = i15 + 1;
            }
            tVar2 = o4;
            if (androidx.compose.animation.y.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new b0(j2Var, lVar, j4, l4, l5, t8Var, x3Var, s8Var, u3Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void m(androidx.compose.ui.q qVar, boolean z4, boolean z5, boolean z6, String str, ld.a<kotlin.k2> aVar, ld.a<kotlin.k2> aVar2, ld.a<kotlin.k2> aVar3, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-773929258);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.b(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.b(z6) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.q0(str) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.S(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.S(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((38347923 & i5) == 38347922 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-773929258, i5, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2139)");
            }
            androidx.compose.ui.q l4 = androidx.compose.foundation.layout.c2.l(androidx.compose.foundation.layout.c2.h(qVar, 0.0f, 1, null), f9462b);
            i.e p4 = z6 ? androidx.compose.foundation.layout.i.f5073a.p() : androidx.compose.foundation.layout.i.f5073a.l();
            c.InterfaceC0326c q4 = androidx.compose.ui.c.INSTANCE.q();
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(p4, q4, o4, 48);
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(l4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion, o4, d5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(u3Var.getNavigationContentColor())), androidx.compose.runtime.internal.c.b(o4, -962805198, true, new d0(aVar3, z6, str, aVar2, z5, aVar, z4)), o4, androidx.compose.runtime.b3.f15974d | 48);
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e0(qVar, z4, z5, z6, str, aVar, aVar2, aVar3, u3Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void n(Long l4, long j4, int i4, ld.l<? super Long, kotlin.k2> lVar, ld.l<? super Long, kotlin.k2> lVar2, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar3, x3 x3Var, s8 s8Var, u3 u3Var, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-895379221);
        if ((i5 & 6) == 0) {
            i6 = (o4.q0(l4) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.g(j4) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.f(i4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= o4.S(lVar) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= o4.S(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= o4.S(s0Var) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= o4.S(lVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= (16777216 & i5) == 0 ? o4.q0(x3Var) : o4.S(x3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i6 |= o4.q0(s8Var) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i6 |= o4.q0(u3Var) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        int i7 = i6;
        if ((306783379 & i7) == 306783378 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-895379221, i7, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1389)");
            }
            int i10 = -((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i())).q2(androidx.compose.ui.unit.h.g(48));
            p4 c5 = p4.c(i4);
            androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, f0.f9525b, 1, null);
            o4.P(1777156755);
            boolean f5 = o4.f(i10);
            Object Q = o4.Q();
            if (f5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new g0(i10);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.animation.f.b(c5, f4, (ld.l) Q, null, "DatePickerDisplayModeAnimation", null, androidx.compose.runtime.internal.c.b(o4, -459778869, true, new h0(l4, j4, lVar, lVar2, s0Var, lVar3, x3Var, s8Var, u3Var)), o4, ((i7 >> 6) & 14) | 1597440, 40);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new i0(l4, j4, i4, lVar, lVar2, s0Var, lVar3, x3Var, s8Var, u3Var, i5));
        }
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void o(@fg.l u3 u3Var, @fg.l androidx.compose.material3.s0 s0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(-1849465391);
        int i5 = (i4 & 6) == 0 ? (o4.q0(u3Var) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i5 |= o4.S(s0Var) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1849465391, i5, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1721)");
            }
            int firstDayOfWeek = s0Var.getFirstDayOfWeek();
            List<kotlin.q0<String, String>> q4 = s0Var.q();
            ArrayList arrayList = new ArrayList();
            int i6 = firstDayOfWeek - 1;
            int size = q4.size();
            for (int i7 = i6; i7 < size; i7++) {
                arrayList.add(q4.get(i7));
            }
            ?? r15 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                arrayList.add(q4.get(i10));
            }
            int i11 = 6;
            androidx.compose.ui.text.v0 a5 = tb.a(p6.f13227a.c(o4, 6), c0.j.f37473a.T());
            androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.c2.b(androidx.compose.ui.q.INSTANCE, 0.0f, f9461a, 1, null), 0.0f, 1, null);
            i.f n4 = androidx.compose.foundation.layout.i.f5073a.n();
            c.InterfaceC0326c q5 = androidx.compose.ui.c.INSTANCE.q();
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(n4, q5, o4, 54);
            int i12 = -1323940314;
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion, o4, d5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            o4.P(-971954356);
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                kotlin.q0 q0Var = (kotlin.q0) arrayList.get(i13);
                q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
                o4.P(784223355);
                boolean q02 = o4.q0(q0Var);
                Object Q = o4.Q();
                if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new j0(q0Var);
                    o4.E(Q);
                }
                o4.p0();
                androidx.compose.ui.q c5 = androidx.compose.ui.semantics.o.c(companion2, (ld.l) Q);
                float f4 = f9461a;
                androidx.compose.ui.q y4 = androidx.compose.foundation.layout.c2.y(c5, f4, f4);
                androidx.compose.ui.c i14 = androidx.compose.ui.c.INSTANCE.i();
                o4.P(733328855);
                androidx.compose.ui.layout.m0 i15 = androidx.compose.foundation.layout.m.i(i14, r15, o4, i11);
                o4.P(i12);
                int j5 = androidx.compose.runtime.p.j(o4, r15);
                androidx.compose.runtime.g0 B2 = o4.B();
                g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a8 = companion3.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(y4);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a8);
                } else {
                    o4.C();
                }
                ld.p a10 = androidx.compose.animation.p.a(companion3, o4, i15, o4, B2);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, o4, j5, a10);
                }
                androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
                androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
                String str = (String) q0Var.f();
                androidx.compose.ui.q H = androidx.compose.foundation.layout.c2.H(companion2, null, false, 3, null);
                long weekdayContentColor = u3Var.getWeekdayContentColor();
                androidx.compose.ui.text.style.j.INSTANCE.getClass();
                androidx.compose.runtime.t tVar3 = o4;
                xa.c(str, H, weekdayContentColor, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f21356e), 0L, 0, false, 0, 0, null, a5, tVar3, 48, 0, 65016);
                tVar3.p0();
                tVar3.H();
                tVar3.p0();
                tVar3.p0();
                i13++;
                i12 = -1323940314;
                r15 = 0;
                i11 = 6;
                size2 = size2;
                o4 = tVar3;
                arrayList = arrayList;
            }
            tVar2 = o4;
            if (androidx.compose.animation.y.a(tVar2)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new k0(u3Var, s0Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void p(androidx.compose.ui.q qVar, boolean z4, boolean z5, ld.a<kotlin.k2> aVar, boolean z6, String str, u3 u3Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        Object a5;
        androidx.compose.runtime.t tVar2;
        androidx.compose.runtime.t o4 = tVar.o(238547184);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.b(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(aVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.b(z6) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.q0(str) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= o4.S(pVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) == 4793490 && o4.p()) {
            o4.d0();
            tVar2 = o4;
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(238547184, i5, -1, "androidx.compose.material3.Year (DatePicker.kt:2085)");
            }
            o4.P(84263149);
            int i6 = i5 & 112;
            boolean z7 = ((i5 & 896) == 256) | (i6 == 32);
            Object Q = o4.Q();
            if (z7 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                a5 = (!z5 || z4) ? null : androidx.compose.foundation.d0.a(c0.j.f37473a.q(), u3Var.getTodayDateBorderColor());
                o4.E(a5);
            } else {
                a5 = Q;
            }
            androidx.compose.foundation.c0 c0Var = (androidx.compose.foundation.c0) a5;
            o4.p0();
            o4.P(84263865);
            boolean z10 = (458752 & i5) == 131072;
            Object Q2 = o4.Q();
            if (z10 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new l0(str);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.ui.q e4 = androidx.compose.ui.semantics.o.e(qVar, true, (ld.l) Q2);
            androidx.compose.ui.graphics.e6 e5 = x8.e(c0.j.f37473a.P(), o4, 6);
            int i7 = i5 >> 3;
            int i10 = i7 & 14;
            int i11 = i5 >> 9;
            long M = u3Var.E(z4, z6, o4, i10 | (i11 & 112) | ((i5 >> 12) & 896)).getValue().M();
            int i12 = i5 >> 6;
            long M2 = u3Var.F(z5, z4, z6, o4, (i12 & 14) | i6 | (i12 & 896) | (i11 & 7168)).getValue().M();
            tVar2 = o4;
            x9.b(z4, aVar, e4, z6, e5, M, M2, 0.0f, 0.0f, c0Var, null, androidx.compose.runtime.internal.c.b(tVar2, -1573188346, true, new m0(pVar)), tVar2, i10 | (i12 & 112) | (i7 & 7168), 48, 1408);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = tVar2.t();
        if (t4 != null) {
            t4.a(new n0(qVar, z4, z5, aVar, z6, str, u3Var, pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void q(androidx.compose.ui.q qVar, long j4, ld.l<? super Integer, kotlin.k2> lVar, s8 s8Var, androidx.compose.material3.s0 s0Var, kotlin.ranges.l lVar2, u3 u3Var, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1286899812);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.g(j4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.q0(s8Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(s0Var) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.S(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= o4.q0(u3Var) ? 1048576 : 524288;
        }
        if ((599187 & i5) == 599186 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1286899812, i5, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1993)");
            }
            xa.a(tb.a(p6.f13227a.c(o4, 6), c0.j.f37473a.L()), androidx.compose.runtime.internal.c.b(o4, 1301915789, true, new o0(s0Var, j4, lVar2, u3Var, qVar, lVar, s8Var)), o4, 48);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p0(qVar, j4, lVar, s8Var, s0Var, lVar2, u3Var, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(ld.a<kotlin.k2> r20, boolean r21, androidx.compose.ui.q r22, ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r23, androidx.compose.runtime.t r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.a4.r(ld.a, boolean, androidx.compose.ui.q, ld.p, androidx.compose.runtime.t, int, int):void");
    }
}
