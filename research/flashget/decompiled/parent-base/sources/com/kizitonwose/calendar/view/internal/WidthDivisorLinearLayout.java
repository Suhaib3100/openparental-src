package com.kizitonwose.calendar.view.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.d2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: WeekHolder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/WidthDivisorLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/k2;", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "I", "a", "()I", "(I)V", "widthDivisorForHeight", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nWeekHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekHolder.kt\ncom/kizitonwose/calendar/view/internal/WidthDivisorLinearLayout\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,71:1\n2159#2:72\n2160#2:74\n302#3:73\n*S KotlinDebug\n*F\n+ 1 WeekHolder.kt\ncom/kizitonwose/calendar/view/internal/WidthDivisorLinearLayout\n*L\n34#1:72\n34#1:74\n34#1:73\n*E\n"})
/* loaded from: classes6.dex */
final class WidthDivisorLinearLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int widthDivisorForHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(@fg.l Context context) {
        super(context);
        l0.p(context, ProtectedSandApp.s("ᓛ\u0001"));
    }

    /* renamed from: a, reason: from getter */
    public final int getWidthDivisorForHeight() {
        return this.widthDivisorForHeight;
    }

    public final void b(int i4) {
        this.widthDivisorForHeight = i4;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l4, int t4, int r4, int b5) {
        super.onLayout(changed, l4, t4, r4, b5);
        Iterator<View> it = d2.e(this).iterator();
        while (it.hasNext()) {
            if (it.next().getVisibility() == 8) {
                throw new IllegalStateException(ProtectedSandApp.s("ᓜ\u0001"));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.widthDivisorForHeight > 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec) / this.widthDivisorForHeight, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(@fg.l Context context, @fg.m AttributeSet attributeSet) {
        super(context, attributeSet);
        l0.p(context, ProtectedSandApp.s("ᓛ\u0001"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidthDivisorLinearLayout(@fg.l Context context, @fg.m AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        l0.p(context, ProtectedSandApp.s("ᓛ\u0001"));
    }
}
