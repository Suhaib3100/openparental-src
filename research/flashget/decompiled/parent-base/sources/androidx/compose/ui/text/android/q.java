package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LayoutIntrinsics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "c", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "desiredWidth", "charSequence", "textPaint", "", "e", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1855#2,2:170\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n139#1:170,2\n*E\n"})
/* loaded from: classes.dex */
public final class q {
    public static final float c(@fg.l CharSequence charSequence, @fg.l TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i4 = 0;
        lineInstance.setText(new g(charSequence, 0, charSequence.length()));
        PriorityQueue<kotlin.q0> priorityQueue = new PriorityQueue(10, new p());
        int next = lineInstance.next();
        while (true) {
            int i5 = i4;
            i4 = next;
            if (i4 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new kotlin.q0(Integer.valueOf(i5), Integer.valueOf(i4)));
            } else {
                kotlin.q0 q0Var = (kotlin.q0) priorityQueue.peek();
                if (q0Var != null && ((Number) q0Var.f()).intValue() - ((Number) q0Var.e()).intValue() < i4 - i5) {
                    priorityQueue.poll();
                    priorityQueue.add(new kotlin.q0(Integer.valueOf(i5), Integer.valueOf(i4)));
                }
            }
            next = lineInstance.next();
        }
        float f4 = 0.0f;
        for (kotlin.q0 q0Var2 : priorityQueue) {
            f4 = Math.max(f4, Layout.getDesiredWidth(charSequence, ((Number) q0Var2.a()).intValue(), ((Number) q0Var2.b()).intValue(), textPaint));
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(kotlin.q0 q0Var, kotlin.q0 q0Var2) {
        return (((Number) q0Var.f()).intValue() - ((Number) q0Var.e()).intValue()) - (((Number) q0Var2.f()).intValue() - ((Number) q0Var2.e()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (androidx.compose.ui.text.android.v.a(r2, s0.e.class) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L24
        L6:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L1c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<s0.f> r1 = s0.f.class
            boolean r1 = androidx.compose.ui.text.android.v.a(r2, r1)
            if (r1 != 0) goto L26
            java.lang.Class<s0.e> r1 = s0.e.class
            boolean r1 = androidx.compose.ui.text.android.v.a(r2, r1)
            if (r1 != 0) goto L26
        L1c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.q.e(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
