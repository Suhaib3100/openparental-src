package androidx.content.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.appcompat.graphics.drawable.e;
import androidx.content.f0;
import androidx.content.i;
import androidx.content.u;
import androidx.content.ui.t;
import androidx.customview.widget.c;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.q0;
import kotlin.text.m0;

/* compiled from: AbstractAppBarOnDestinationChangedListener.kt */
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH$¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H$¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R$\u0010'\u001a\u0012\u0012\f\u0012\n %*\u0004\u0018\u00010$0$\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/navigation/ui/a;", "Landroidx/navigation/u$c;", "Landroid/content/Context;", "context", "Landroidx/navigation/ui/d;", "configuration", "<init>", "(Landroid/content/Context;Landroidx/navigation/ui/d;)V", "", "showAsDrawerIndicator", "Lkotlin/k2;", "b", "(Z)V", "", "title", "d", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "icon", "", "contentDescription", "c", "(Landroid/graphics/drawable/Drawable;I)V", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "Landroid/content/Context;", "", "Ljava/util/Set;", "topLevelDestinations", "Ljava/lang/ref/WeakReference;", "Landroidx/customview/widget/c;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "openableLayoutWeakReference", "Landroidx/appcompat/graphics/drawable/e;", "Landroidx/appcompat/graphics/drawable/e;", "arrowDrawable", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "animator", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a implements u.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Set<Integer> topLevelDestinations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final WeakReference<c> openableLayoutWeakReference;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private e arrowDrawable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private ValueAnimator animator;

    public a(@l Context context, @l d configuration) {
        l0.p(context, "context");
        l0.p(configuration, "configuration");
        this.context = context;
        this.topLevelDestinations = configuration.d();
        c openableLayout = configuration.getOpenableLayout();
        this.openableLayoutWeakReference = openableLayout == null ? null : new WeakReference<>(openableLayout);
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void b(boolean showAsDrawerIndicator) {
        e eVar = this.arrowDrawable;
        q0 q0Var = eVar == null ? null : new q0(eVar, Boolean.TRUE);
        if (q0Var == null) {
            e eVar2 = new e(this.context);
            this.arrowDrawable = eVar2;
            q0Var = new q0(eVar2, Boolean.FALSE);
        }
        e eVar3 = (e) q0Var.a();
        boolean booleanValue = ((Boolean) q0Var.b()).booleanValue();
        c(eVar3, showAsDrawerIndicator ? t.d.f31368b : t.d.f31367a);
        float f4 = showAsDrawerIndicator ? 0.0f : 1.0f;
        if (!booleanValue) {
            eVar3.setProgress(f4);
            return;
        }
        float i4 = eVar3.i();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar3, "progress", i4, f4);
        this.animator = ofFloat;
        if (ofFloat == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.animation.ObjectAnimator");
        }
        ofFloat.start();
    }

    @Override // androidx.navigation.u.c
    public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
        l0.p(controller, "controller");
        l0.p(destination, "destination");
        if (destination instanceof i) {
            return;
        }
        WeakReference<c> weakReference = this.openableLayoutWeakReference;
        c cVar = weakReference == null ? null : weakReference.get();
        if (this.openableLayoutWeakReference != null && cVar == null) {
            controller.H0(this);
            return;
        }
        CharSequence label = destination.getLabel();
        if (label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(label);
            while (matcher.find()) {
                String group = matcher.group(1);
                if (arguments == null || !arguments.containsKey(group)) {
                    throw new IllegalArgumentException("Could not find \"" + ((Object) group) + "\" in " + arguments + " to fill label \"" + ((Object) label) + m0.quote);
                }
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(String.valueOf(arguments.get(group)));
            }
            matcher.appendTail(stringBuffer);
            d(stringBuffer);
        }
        boolean i4 = q.i(destination, this.topLevelDestinations);
        if (cVar == null && i4) {
            c(null, 0);
        } else {
            b(cVar != null && i4);
        }
    }

    protected abstract void c(@m Drawable icon, @g1 int contentDescription);

    protected abstract void d(@m CharSequence title);
}
