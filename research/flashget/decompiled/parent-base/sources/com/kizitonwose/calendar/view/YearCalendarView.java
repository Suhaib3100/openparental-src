package com.kizitonwose.calendar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.g0;
import androidx.annotation.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.kizitonwose.calendar.view.g;
import com.kizitonwose.calendar.view.internal.yearcalendar.YearCalendarLayoutManager;
import com.kizitonwose.calendar.view.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: YearCalendarView.kt */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002Ì\u0001\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b/\u0010(J!\u00100\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b0\u0010.J\u0015\u00101\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b1\u0010(J!\u00102\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b2\u0010.J)\u00104\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020+03\"\u00020+¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b6\u0010#J\u0015\u00107\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b7\u0010\u001eJ\r\u00108\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0012J\u000f\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u0004\u0018\u000109¢\u0006\u0004\b<\u0010;J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010=¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u0004\u0018\u00010%¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u0004\u0018\u00010%¢\u0006\u0004\bC\u0010BJ%\u0010G\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u0019¢\u0006\u0004\bG\u0010HJ-\u0010I\u001a\u00020\u000e2\b\b\u0002\u0010D\u001a\u00020\u00152\b\b\u0002\u0010E\u001a\u00020\u00152\b\b\u0002\u0010F\u001a\u00020\u0019H\u0007¢\u0006\u0004\bI\u0010HR6\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010J2\f\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR6\u0010Z\u001a\b\u0012\u0002\b\u0003\u0018\u00010S2\f\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR6\u0010^\u001a\b\u0012\u0002\b\u0003\u0018\u00010S2\f\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010S8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR6\u0010e\u001a\b\u0012\u0002\b\u0003\u0018\u00010_2\f\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR6\u0010h\u001a\b\u0012\u0002\b\u0003\u0018\u00010_2\f\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010_8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010`\u001a\u0004\bf\u0010b\"\u0004\bg\u0010dR6\u0010p\u001a\u0016\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000e\u0018\u00010ij\u0004\u0018\u0001`j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010v\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR*\u0010y\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010q\u001a\u0004\bw\u0010s\"\u0004\bx\u0010uR*\u0010|\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010q\u001a\u0004\bz\u0010s\"\u0004\b{\u0010uR+\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010q\u001a\u0004\b~\u0010s\"\u0004\b\u007f\u0010uR.\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010q\u001a\u0005\b\u0082\u0001\u0010s\"\u0005\b\u0083\u0001\u0010uR6\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010K\u001a\u0005\u0018\u00010\u0085\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bN\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R7\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010K\u001a\u0005\u0018\u00010\u0085\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u0086\u0001\u001a\u0006\b\u008d\u0001\u0010\u0088\u0001\"\u0006\b\u008e\u0001\u0010\u008a\u0001R-\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\br\u0010q\u001a\u0005\b\u0090\u0001\u0010s\"\u0005\b\u0091\u0001\u0010uR.\u0010\u0096\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010q\u001a\u0005\b\u0094\u0001\u0010s\"\u0005\b\u0095\u0001\u0010uR.\u0010\u0099\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010q\u001a\u0005\b\u0097\u0001\u0010s\"\u0005\b\u0098\u0001\u0010uRi\u0010\u009f\u0001\u001a \u0012\u0015\u0012\u00130=¢\u0006\u000e\b\u009a\u0001\u0012\t\b\u009b\u0001\u0012\u0004\b\b(!\u0012\u0005\u0012\u00030\u009c\u00010i2$\u0010K\u001a \u0012\u0015\u0012\u00130=¢\u0006\u000e\b\u009a\u0001\u0012\t\b\u009b\u0001\u0012\u0004\b\b(!\u0012\u0005\u0012\u00030\u009c\u00010i8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\\\u0010k\u001a\u0005\b\u009d\u0001\u0010m\"\u0005\b\u009e\u0001\u0010oR4\u0010£\u0001\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u001b\n\u0004\bz\u0010q\u0012\u0005\b¢\u0001\u0010\u0012\u001a\u0005\b \u0001\u0010s\"\u0005\b¡\u0001\u0010uR1\u0010¨\u0001\u001a\u00030\u009c\u00012\u0007\u0010K\u001a\u00030\u009c\u00018\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0004\bV\u0010\u0016\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R2\u0010¯\u0001\u001a\u00030©\u00012\u0007\u0010K\u001a\u00030©\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bw\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R3\u0010¶\u0001\u001a\u00030°\u00012\u0007\u0010K\u001a\u00030°\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b\u008c\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R3\u0010¼\u0001\u001a\u00030·\u00012\u0007\u0010K\u001a\u00030·\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010¸\u0001\u001a\u0006\b±\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R2\u0010Â\u0001\u001a\u00030½\u00012\u0007\u0010K\u001a\u00030½\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010¾\u0001\u001a\u0005\bq\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R3\u0010Å\u0001\u001a\u00030½\u00012\u0007\u0010K\u001a\u00030½\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010¾\u0001\u001a\u0006\bÃ\u0001\u0010¿\u0001\"\u0006\bÄ\u0001\u0010Á\u0001R,\u0010Ë\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b \u0001\u0010Ç\u0001\u001a\u0006\b\u0093\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Î\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010Í\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010Ð\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010Ó\u0001R\u001a\u0010×\u0001\u001a\u00030Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ö\u0001R\u0019\u0010D\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010Ø\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010Ø\u0001R\u0019\u0010F\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010Ù\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010Û\u0001R\u0017\u0010ß\u0001\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b}\u0010Þ\u0001¨\u0006à\u0001"}, d2 = {"Lcom/kizitonwose/calendar/view/YearCalendarView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attributeSet", "defStyleRes", "Lkotlin/k2;", "L", "(Landroid/util/AttributeSet;II)V", "M", "()V", "N0", "M0", "Lorg/threeten/bp/p;", "Z", "()Lorg/threeten/bp/p;", "X", "Lorg/threeten/bp/d;", "Y", "()Lorg/threeten/bp/d;", "year", "f0", "(Lorg/threeten/bp/p;)V", "L0", "Lorg/threeten/bp/q;", "month", "e0", "(Lorg/threeten/bp/q;)V", "K0", "Lcb/a;", "day", "d0", "(Lcb/a;)V", "Lorg/threeten/bp/g;", "date", "Lcb/d;", "position", "b0", "(Lorg/threeten/bp/g;Lcb/d;)V", "J0", "H0", "U", "R", "", "S", "(Lorg/threeten/bp/g;[Lcb/d;)V", "V", "W", "P", "Lcb/c;", "g", "()Lcb/c;", "j", "Lcb/b;", "f", "()Lcb/b;", "i", "e", "()Lcb/a;", "h", "startYear", "endYear", "firstDayOfWeek", "F0", "(Lorg/threeten/bp/p;Lorg/threeten/bp/p;Lorg/threeten/bp/d;)V", "R0", "Lcom/kizitonwose/calendar/view/h;", "value", "b", "Lcom/kizitonwose/calendar/view/h;", "m", "()Lcom/kizitonwose/calendar/view/h;", "g0", "(Lcom/kizitonwose/calendar/view/h;)V", "dayBinder", "Lcom/kizitonwose/calendar/view/i;", "c", "Lcom/kizitonwose/calendar/view/i;", "t", "()Lcom/kizitonwose/calendar/view/i;", "n0", "(Lcom/kizitonwose/calendar/view/i;)V", "monthHeaderBinder", "d", "r", "l0", "monthFooterBinder", "Lcom/kizitonwose/calendar/view/q;", "Lcom/kizitonwose/calendar/view/q;", "G", "()Lcom/kizitonwose/calendar/view/q;", "A0", "(Lcom/kizitonwose/calendar/view/q;)V", "yearHeaderBinder", "E", "y0", "yearFooterBinder", "Lkotlin/Function1;", "Lcom/kizitonwose/calendar/view/YearScrollListener;", "Lld/l;", "J", "()Lld/l;", "D0", "(Lld/l;)V", "yearScrollListener", "I", "o", "()I", "i0", "(I)V", "dayViewResource", "u", "o0", "monthHeaderResource", "s", "m0", "monthFooterResource", "k", "H", "B0", "yearHeaderResource", "l", "F", "z0", "yearFooterResource", "", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "s0", "(Ljava/lang/String;)V", "monthViewClass", "n", "K", "E0", "yearViewClass", "x", "r0", "monthVerticalSpacing", "p", "w", "q0", "monthHorizontalSpacing", "q", "k0", "monthColumns", "Lkotlin/r0;", "name", "", "O", "t0", "isMonthVisible", "z", "u0", "A", "orientation", "C", "()Z", "w0", "(Z)V", "scrollPaged", "Lcb/g;", "Lcb/g;", "B", "()Lcb/g;", "v0", "(Lcb/g;)V", "outDateStyle", "Lcom/kizitonwose/calendar/view/e;", "v", "Lcom/kizitonwose/calendar/view/e;", "()Lcom/kizitonwose/calendar/view/e;", "h0", "(Lcom/kizitonwose/calendar/view/e;)V", "daySize", "Lcom/kizitonwose/calendar/view/j;", "Lcom/kizitonwose/calendar/view/j;", "()Lcom/kizitonwose/calendar/view/j;", "p0", "(Lcom/kizitonwose/calendar/view/j;)V", "monthHeight", "Lcom/kizitonwose/calendar/view/g;", "Lcom/kizitonwose/calendar/view/g;", "()Lcom/kizitonwose/calendar/view/g;", "C0", "(Lcom/kizitonwose/calendar/view/g;)V", "yearMargins", "D", "x0", "yearBodyMargins", "Lcom/kizitonwose/calendar/view/f;", "Lcom/kizitonwose/calendar/view/f;", "()Lcom/kizitonwose/calendar/view/f;", "j0", "(Lcom/kizitonwose/calendar/view/f;)V", "layoutHelper", "com/kizitonwose/calendar/view/YearCalendarView$c", "Lcom/kizitonwose/calendar/view/YearCalendarView$c;", "scrollListenerInternal", "Lcom/kizitonwose/calendar/view/internal/g;", "Lcom/kizitonwose/calendar/view/internal/g;", "horizontalSnapHelper", "Lcom/kizitonwose/calendar/view/internal/e;", "Lcom/kizitonwose/calendar/view/internal/e;", "verticalSnapHelper", "Landroidx/recyclerview/widget/a0;", "Landroidx/recyclerview/widget/a0;", "pageSnapHelper", "Lorg/threeten/bp/p;", "Lorg/threeten/bp/d;", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;", "()Lcom/kizitonwose/calendar/view/internal/yearcalendar/YearCalendarLayoutManager;", "calendarLayoutManager", "Lcom/kizitonwose/calendar/view/internal/yearcalendar/c;", "()Lcom/kizitonwose/calendar/view/internal/yearcalendar/c;", "calendarAdapter", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nYearCalendarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearCalendarView.kt\ncom/kizitonwose/calendar/view/YearCalendarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,719:1\n1#2:720\n59#3,2:721\n11065#4:723\n11400#4,3:724\n37#5,2:727\n*S KotlinDebug\n*F\n+ 1 YearCalendarView.kt\ncom/kizitonwose/calendar/view/YearCalendarView\n*L\n367#1:721,2\n560#1:723\n560#1:724,3\n562#1:727,2\n*E\n"})
/* loaded from: classes6.dex */
public class YearCalendarView extends RecyclerView {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final c scrollListenerInternal;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.internal.g horizontalSnapHelper;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final com.kizitonwose.calendar.view.internal.e verticalSnapHelper;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private a0 pageSnapHelper;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.m
    private org.threeten.bp.p startYear;

    /* renamed from: F, reason: from kotlin metadata */
    @fg.m
    private org.threeten.bp.p endYear;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.m
    private org.threeten.bp.d firstDayOfWeek;

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
    private q<?> yearHeaderBinder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private q<?> yearFooterBinder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super cb.c, k2> yearScrollListener;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int dayViewResource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int monthHeaderResource;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int monthFooterResource;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int yearHeaderResource;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int yearFooterResource;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String monthViewClass;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private String yearViewClass;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @u0
    private int monthVerticalSpacing;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @u0
    private int monthHorizontalSpacing;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @g0(from = 1, to = 12)
    private int monthColumns;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super cb.b, Boolean> isMonthVisible;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int orientation;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean scrollPaged;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private cb.g outDateStyle;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e daySize;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j monthHeight;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g yearMargins;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g yearBodyMargins;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f layoutHelper;

    /* compiled from: YearCalendarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<j> f66710a = kotlin.enums.c.c(j.values());

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<cb.g> f66711b = kotlin.enums.c.c(cb.g.values());
    }

    /* compiled from: YearCalendarView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcb/b;", "it", "", "a", "(Lcb/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.l<cb.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f66712b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l cb.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("ᒱ\u0001"));
            return Boolean.TRUE;
        }
    }

    /* compiled from: YearCalendarView.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/kizitonwose/calendar/view/YearCalendarView$c", "Landroidx/recyclerview/widget/RecyclerView$s;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "Lkotlin/k2;", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.s {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(@fg.l RecyclerView recyclerView, int newState) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒲ\u0001"));
            if (newState == 0) {
                YearCalendarView.this.k().y();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrolled(@fg.l RecyclerView recyclerView, int dx, int dy) {
            l0.p(recyclerView, ProtectedSandApp.s("ᒲ\u0001"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearCalendarView(@fg.l Context context) {
        super(context);
        l0.p(context, ProtectedSandApp.s("ᒳ\u0001"));
        this.monthColumns = 3;
        this.isMonthVisible = b.f66712b;
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        this.monthHeight = j.FollowDaySize;
        g.Companion companion = g.INSTANCE;
        companion.getClass();
        this.yearMargins = g.f66720f;
        companion.getClass();
        this.yearBodyMargins = g.f66720f;
        this.scrollListenerInternal = new c();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void I0(YearCalendarView yearCalendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒵ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        yearCalendarView.H0(gVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L(AttributeSet attributeSet, int defStyleAttr, int defStyleRes) {
        if (isInEditMode()) {
            return;
        }
        setItemAnimator(null);
        setHasFixedSize(true);
        Context context = getContext();
        l0.o(context, ProtectedSandApp.s("ᒶ\u0001"));
        int[] iArr = k.j.P0;
        l0.o(iArr, ProtectedSandApp.s("ᒷ\u0001"));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, defStyleAttr, defStyleRes);
        i0(obtainStyledAttributes.getResourceId(k.j.R0, this.dayViewResource));
        o0(obtainStyledAttributes.getResourceId(k.j.U0, this.monthHeaderResource));
        m0(obtainStyledAttributes.getResourceId(k.j.T0, this.monthFooterResource));
        B0(obtainStyledAttributes.getResourceId(k.j.f67016d1, this.yearHeaderResource));
        z0(obtainStyledAttributes.getResourceId(k.j.f67013c1, this.yearFooterResource));
        u0(obtainStyledAttributes.getInt(k.j.Z0, this.orientation));
        w0(obtainStyledAttributes.getBoolean(k.j.f67010b1, this.orientation == 0));
        h0((e) e.getEntries().get(obtainStyledAttributes.getInt(k.j.Q0, this.daySize.ordinal())));
        p0((j) a.f66710a.get(obtainStyledAttributes.getInt(k.j.V0, this.monthHeight.ordinal())));
        v0((cb.g) a.f66711b.get(obtainStyledAttributes.getInt(k.j.f67007a1, this.outDateStyle.ordinal())));
        k0(obtainStyledAttributes.getInt(k.j.S0, this.monthColumns));
        q0(obtainStyledAttributes.getDimensionPixelSize(k.j.W0, this.monthHorizontalSpacing));
        r0(obtainStyledAttributes.getDimensionPixelSize(k.j.X0, this.monthVerticalSpacing));
        s0(obtainStyledAttributes.getString(k.j.Y0));
        E0(obtainStyledAttributes.getString(k.j.f67019e1));
        obtainStyledAttributes.recycle();
        if (this.dayViewResource == 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ᒸ\u0001"));
        }
    }

    private final void M() {
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
        post(new Runnable() { // from class: com.kizitonwose.calendar.view.p
            @Override // java.lang.Runnable
            public final void run() {
                YearCalendarView.N(YearCalendarView.this);
            }
        });
    }

    private final void M0() {
        k().I(Z(), X(), this.outDateStyle, Y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(YearCalendarView yearCalendarView) {
        l0.p(yearCalendarView, ProtectedSandApp.s("ᒹ\u0001"));
        yearCalendarView.k().y();
    }

    private final void N0() {
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

    public static /* synthetic */ void S0(YearCalendarView yearCalendarView, org.threeten.bp.p pVar, org.threeten.bp.p pVar2, org.threeten.bp.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒺ\u0001"));
        }
        if ((i4 & 1) != 0) {
            pVar = yearCalendarView.Z();
        }
        if ((i4 & 2) != 0) {
            pVar2 = yearCalendarView.X();
        }
        if ((i4 & 4) != 0) {
            dVar = yearCalendarView.Y();
        }
        yearCalendarView.R0(pVar, pVar2, dVar);
    }

    public static /* synthetic */ void T(YearCalendarView yearCalendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒻ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        yearCalendarView.R(gVar, dVar);
    }

    private final org.threeten.bp.p X() {
        org.threeten.bp.p pVar = this.endYear;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒼ\u0001")).toString());
    }

    private final org.threeten.bp.d Y() {
        org.threeten.bp.d dVar = this.firstDayOfWeek;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒽ\u0001")).toString());
    }

    private final org.threeten.bp.p Z() {
        org.threeten.bp.p pVar = this.startYear;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException(com.kizitonwose.calendar.view.internal.l.d(ProtectedSandApp.s("ᒾ\u0001")).toString());
    }

    public static /* synthetic */ void c0(YearCalendarView yearCalendarView, org.threeten.bp.g gVar, cb.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᒿ\u0001"));
        }
        if ((i4 & 2) != 0) {
            dVar = cb.d.MonthDate;
        }
        yearCalendarView.b0(gVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.kizitonwose.calendar.view.internal.yearcalendar.c k() {
        RecyclerView.h adapter = getAdapter();
        l0.n(adapter, ProtectedSandApp.s("ᓀ\u0001"));
        return (com.kizitonwose.calendar.view.internal.yearcalendar.c) adapter;
    }

    private final YearCalendarLayoutManager l() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        l0.n(layoutManager, ProtectedSandApp.s("ᓁ\u0001"));
        return (YearCalendarLayoutManager) layoutManager;
    }

    public final void A0(@fg.m q<?> qVar) {
        this.yearHeaderBinder = qVar;
        M();
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final cb.g getOutDateStyle() {
        return this.outDateStyle;
    }

    public final void B0(int i4) {
        if (this.yearHeaderResource != i4) {
            this.yearHeaderResource = i4;
            M();
        }
    }

    /* renamed from: C, reason: from getter */
    public final boolean getScrollPaged() {
        return this.scrollPaged;
    }

    public final void C0(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (l0.g(this.yearMargins, gVar)) {
            return;
        }
        this.yearMargins = gVar;
        M();
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final g getYearBodyMargins() {
        return this.yearBodyMargins;
    }

    public final void D0(@fg.m ld.l<? super cb.c, k2> lVar) {
        this.yearScrollListener = lVar;
    }

    @fg.m
    public final q<?> E() {
        return this.yearFooterBinder;
    }

    public final void E0(@fg.m String str) {
        if (l0.g(this.yearViewClass, str)) {
            return;
        }
        this.yearViewClass = str;
        M();
    }

    /* renamed from: F, reason: from getter */
    public final int getYearFooterResource() {
        return this.yearFooterResource;
    }

    public final void F0(@fg.l org.threeten.bp.p startYear, @fg.l org.threeten.bp.p endYear, @fg.l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startYear, ProtectedSandApp.s("ᒾ\u0001"));
        l0.p(endYear, ProtectedSandApp.s("ᒼ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒽ\u0001"));
        db.f.a(startYear, endYear);
        this.startYear = startYear;
        this.endYear = endYear;
        this.firstDayOfWeek = firstDayOfWeek;
        removeOnScrollListener(this.scrollListenerInternal);
        addOnScrollListener(this.scrollListenerInternal);
        setLayoutManager(new YearCalendarLayoutManager(this));
        setAdapter(new com.kizitonwose.calendar.view.internal.yearcalendar.c(this, this.outDateStyle, startYear, endYear, firstDayOfWeek));
    }

    @fg.m
    public final q<?> G() {
        return this.yearHeaderBinder;
    }

    @kd.j
    public final void G0(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓃ\u0001"));
        I0(this, gVar, null, 2, null);
    }

    /* renamed from: H, reason: from getter */
    public final int getYearHeaderResource() {
        return this.yearHeaderResource;
    }

    @kd.j
    public final void H0(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᓃ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᓄ\u0001"));
        J0(new cb.a(date, position));
    }

    @fg.l
    /* renamed from: I, reason: from getter */
    public final g getYearMargins() {
        return this.yearMargins;
    }

    @fg.m
    public final ld.l<cb.c, k2> J() {
        return this.yearScrollListener;
    }

    public final void J0(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᓅ\u0001"));
        l().W(day);
    }

    @fg.m
    /* renamed from: K, reason: from getter */
    public final String getYearViewClass() {
        return this.yearViewClass;
    }

    public final void K0(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᓆ\u0001"));
        l().m0(month);
    }

    public final void L0(@fg.l org.threeten.bp.p year) {
        l0.p(year, ProtectedSandApp.s("ᓇ\u0001"));
        l().X(year);
    }

    @fg.l
    public final ld.l<cb.b, Boolean> O() {
        return this.isMonthVisible;
    }

    @kd.j
    public final void O0() {
        S0(this, null, null, null, 7, null);
    }

    public final void P() {
        k().E();
    }

    @kd.j
    public final void P0(@fg.l org.threeten.bp.p pVar) {
        l0.p(pVar, ProtectedSandApp.s("ᒾ\u0001"));
        S0(this, pVar, null, null, 6, null);
    }

    @kd.j
    public final void Q(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓃ\u0001"));
        T(this, gVar, null, 2, null);
    }

    @kd.j
    public final void Q0(@fg.l org.threeten.bp.p pVar, @fg.l org.threeten.bp.p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("ᒾ\u0001"));
        l0.p(pVar2, ProtectedSandApp.s("ᒼ\u0001"));
        S0(this, pVar, pVar2, null, 4, null);
    }

    @kd.j
    public final void R(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᓃ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᓄ\u0001"));
        U(new cb.a(date, position));
    }

    @kd.j
    public final void R0(@fg.l org.threeten.bp.p startYear, @fg.l org.threeten.bp.p endYear, @fg.l org.threeten.bp.d firstDayOfWeek) {
        l0.p(startYear, ProtectedSandApp.s("ᒾ\u0001"));
        l0.p(endYear, ProtectedSandApp.s("ᒼ\u0001"));
        l0.p(firstDayOfWeek, ProtectedSandApp.s("ᒽ\u0001"));
        db.f.a(startYear, endYear);
        this.startYear = startYear;
        this.endYear = endYear;
        this.firstDayOfWeek = firstDayOfWeek;
        M0();
    }

    public final void S(@fg.l org.threeten.bp.g date, @fg.l cb.d... position) {
        l0.p(date, ProtectedSandApp.s("ᓃ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᓄ\u0001"));
        if (position.length == 0) {
            position = new cb.d[]{cb.d.MonthDate};
        }
        ArrayList arrayList = new ArrayList(position.length);
        for (cb.d dVar : position) {
            arrayList.add(new cb.a(date, dVar));
        }
        Set a6 = w.a6(arrayList);
        com.kizitonwose.calendar.view.internal.yearcalendar.c k4 = k();
        cb.a[] aVarArr = (cb.a[]) a6.toArray(new cb.a[0]);
        k4.F((cb.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public final void U(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᓅ\u0001"));
        k().F(day);
    }

    public final void V(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᓆ\u0001"));
        k().G(month);
    }

    public final void W(@fg.l org.threeten.bp.p year) {
        l0.p(year, ProtectedSandApp.s("ᓇ\u0001"));
        k().H(year);
    }

    @kd.j
    public final void a0(@fg.l org.threeten.bp.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓃ\u0001"));
        c0(this, gVar, null, 2, null);
    }

    @kd.j
    public final void b0(@fg.l org.threeten.bp.g date, @fg.l cb.d position) {
        l0.p(date, ProtectedSandApp.s("ᓃ\u0001"));
        l0.p(position, ProtectedSandApp.s("ᓄ\u0001"));
        d0(new cb.a(date, position));
    }

    public final void d0(@fg.l cb.a day) {
        l0.p(day, ProtectedSandApp.s("ᓅ\u0001"));
        l().Q(day);
    }

    @fg.m
    public final cb.a e() {
        return k().i();
    }

    public final void e0(@fg.l org.threeten.bp.q month) {
        l0.p(month, ProtectedSandApp.s("ᓆ\u0001"));
        l().i0(month);
    }

    @fg.m
    public final cb.b f() {
        return k().j();
    }

    public final void f0(@fg.l org.threeten.bp.p year) {
        l0.p(year, ProtectedSandApp.s("ᓇ\u0001"));
        l().U(year);
    }

    @fg.m
    public final cb.c g() {
        return k().k();
    }

    public final void g0(@fg.m h<?> hVar) {
        this.dayBinder = hVar;
        M();
    }

    @fg.m
    public final cb.a h() {
        return k().m();
    }

    public final void h0(@fg.l e eVar) {
        l0.p(eVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (this.daySize != eVar) {
            this.daySize = eVar;
            M();
        }
    }

    @fg.m
    public final cb.b i() {
        return k().n();
    }

    public final void i0(int i4) {
        if (this.dayViewResource != i4) {
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᓈ\u0001"));
            }
            this.dayViewResource = i4;
            M();
        }
    }

    @fg.m
    public final cb.c j() {
        return k().o();
    }

    public final void j0(@fg.m f fVar) {
        this.layoutHelper = fVar;
    }

    public final void k0(int i4) {
        if (this.monthColumns != i4) {
            if (1 > i4 || i4 >= 13) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᓉ\u0001"));
            }
            this.monthColumns = i4;
            M();
        }
    }

    public final void l0(@fg.m i<?> iVar) {
        this.monthFooterBinder = iVar;
        M();
    }

    @fg.m
    public final h<?> m() {
        return this.dayBinder;
    }

    public final void m0(int i4) {
        if (this.monthFooterResource != i4) {
            this.monthFooterResource = i4;
            M();
        }
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final e getDaySize() {
        return this.daySize;
    }

    public final void n0(@fg.m i<?> iVar) {
        this.monthHeaderBinder = iVar;
        M();
    }

    /* renamed from: o, reason: from getter */
    public final int getDayViewResource() {
        return this.dayViewResource;
    }

    public final void o0(int i4) {
        if (this.monthHeaderResource != i4) {
            this.monthHeaderResource = i4;
            M();
        }
    }

    @fg.m
    /* renamed from: p, reason: from getter */
    public final f getLayoutHelper() {
        return this.layoutHelper;
    }

    public final void p0(@fg.l j jVar) {
        l0.p(jVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (this.monthHeight != jVar) {
            this.monthHeight = jVar;
            M();
        }
    }

    /* renamed from: q, reason: from getter */
    public final int getMonthColumns() {
        return this.monthColumns;
    }

    public final void q0(int i4) {
        if (this.monthHorizontalSpacing != i4) {
            this.monthHorizontalSpacing = i4;
            M();
        }
    }

    @fg.m
    public final i<?> r() {
        return this.monthFooterBinder;
    }

    public final void r0(int i4) {
        if (this.monthVerticalSpacing != i4) {
            this.monthVerticalSpacing = i4;
            M();
        }
    }

    /* renamed from: s, reason: from getter */
    public final int getMonthFooterResource() {
        return this.monthFooterResource;
    }

    public final void s0(@fg.m String str) {
        if (l0.g(this.monthViewClass, str)) {
            return;
        }
        this.monthViewClass = str;
        M();
    }

    @fg.m
    public final i<?> t() {
        return this.monthHeaderBinder;
    }

    public final void t0(@fg.l ld.l<? super cb.b, Boolean> lVar) {
        l0.p(lVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (l0.g(this.isMonthVisible, lVar)) {
            return;
        }
        this.isMonthVisible = lVar;
        M();
    }

    /* renamed from: u, reason: from getter */
    public final int getMonthHeaderResource() {
        return this.monthHeaderResource;
    }

    public final void u0(int i4) {
        if (this.orientation != i4) {
            this.orientation = i4;
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            YearCalendarLayoutManager yearCalendarLayoutManager = layoutManager instanceof YearCalendarLayoutManager ? (YearCalendarLayoutManager) layoutManager : null;
            if (yearCalendarLayoutManager != null) {
                yearCalendarLayoutManager.setOrientation(i4);
            }
            N0();
        }
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final j getMonthHeight() {
        return this.monthHeight;
    }

    public final void v0(@fg.l cb.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (this.outDateStyle != gVar) {
            this.outDateStyle = gVar;
            if (getAdapter() != null) {
                M0();
            }
        }
    }

    /* renamed from: w, reason: from getter */
    public final int getMonthHorizontalSpacing() {
        return this.monthHorizontalSpacing;
    }

    public final void w0(boolean z4) {
        if (this.scrollPaged != z4) {
            this.scrollPaged = z4;
            N0();
        }
    }

    /* renamed from: x, reason: from getter */
    public final int getMonthVerticalSpacing() {
        return this.monthVerticalSpacing;
    }

    public final void x0(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("ᓂ\u0001"));
        if (l0.g(this.yearBodyMargins, gVar)) {
            return;
        }
        this.yearBodyMargins = gVar;
        M();
    }

    @fg.m
    /* renamed from: y, reason: from getter */
    public final String getMonthViewClass() {
        return this.monthViewClass;
    }

    public final void y0(@fg.m q<?> qVar) {
        this.yearFooterBinder = qVar;
        M();
    }

    /* renamed from: z, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    public final void z0(int i4) {
        if (this.yearFooterResource != i4) {
            this.yearFooterResource = i4;
            M();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearCalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet) {
        super(context, attributeSet);
        l0.p(context, ProtectedSandApp.s("ᒳ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒴ\u0001"));
        this.monthColumns = 3;
        this.isMonthVisible = b.f66712b;
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        this.monthHeight = j.FollowDaySize;
        g.Companion companion = g.INSTANCE;
        companion.getClass();
        this.yearMargins = g.f66720f;
        companion.getClass();
        this.yearBodyMargins = g.f66720f;
        this.scrollListenerInternal = new c();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
        L(attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearCalendarView(@fg.l Context context, @fg.l AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        l0.p(context, ProtectedSandApp.s("ᒳ\u0001"));
        l0.p(attributeSet, ProtectedSandApp.s("ᒴ\u0001"));
        this.monthColumns = 3;
        this.isMonthVisible = b.f66712b;
        this.outDateStyle = cb.g.EndOfRow;
        this.daySize = e.Square;
        this.monthHeight = j.FollowDaySize;
        g.Companion companion = g.INSTANCE;
        companion.getClass();
        this.yearMargins = g.f66720f;
        companion.getClass();
        this.yearBodyMargins = g.f66720f;
        this.scrollListenerInternal = new c();
        com.kizitonwose.calendar.view.internal.g gVar = new com.kizitonwose.calendar.view.internal.g();
        this.horizontalSnapHelper = gVar;
        this.verticalSnapHelper = new com.kizitonwose.calendar.view.internal.e();
        this.pageSnapHelper = gVar;
        L(attributeSet, i4, i4);
    }
}
