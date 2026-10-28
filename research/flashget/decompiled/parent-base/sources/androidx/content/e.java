package androidx.content;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.d0;
import androidx.content.d;
import fg.l;
import fg.m;
import kd.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: ActivityNavigatorDestinationBuilder.kt */
@h0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010!\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017¨\u0006/"}, d2 = {"Landroidx/navigation/e;", "Landroidx/navigation/g0;", "Landroidx/navigation/d$b;", "Landroidx/navigation/d;", "navigator", "", "id", "<init>", "(Landroidx/navigation/d;I)V", "", "route", "(Landroidx/navigation/d;Ljava/lang/String;)V", "k", "()Landroidx/navigation/d$b;", "Landroid/content/Context;", "h", "Landroid/content/Context;", "context", "i", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "u", "(Ljava/lang/String;)V", "targetPackage", "Lkotlin/reflect/d;", "Landroid/app/Activity;", "j", "Lkotlin/reflect/d;", "m", "()Lkotlin/reflect/d;", "r", "(Lkotlin/reflect/d;)V", "activityClass", "l", "q", "action", "Landroid/net/Uri;", "Landroid/net/Uri;", "n", "()Landroid/net/Uri;", "s", "(Landroid/net/Uri;)V", "data", "o", "t", "dataPattern", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends g0<d.b> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private Context context;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private String targetPackage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @m
    private kotlin.reflect.d<? extends Activity> activityClass;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @m
    private String action;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @m
    private Uri data;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @m
    private String dataPattern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @x0(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public e(@l d navigator, @d0 int i4) {
        super(navigator, i4);
        l0.p(navigator, "navigator");
        this.context = navigator.getContext();
    }

    @Override // androidx.content.g0
    @l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public d.b c() {
        d.b bVar = (d.b) super.c();
        bVar.m0(this.targetPackage);
        kotlin.reflect.d<? extends Activity> dVar = this.activityClass;
        if (dVar != null) {
            bVar.i0(new ComponentName(this.context, (Class<?>) b.e(dVar)));
        }
        bVar.h0(this.action);
        bVar.j0(this.data);
        bVar.k0(this.dataPattern);
        return bVar;
    }

    @m
    /* renamed from: l, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @m
    public final kotlin.reflect.d<? extends Activity> m() {
        return this.activityClass;
    }

    @m
    /* renamed from: n, reason: from getter */
    public final Uri getData() {
        return this.data;
    }

    @m
    /* renamed from: o, reason: from getter */
    public final String getDataPattern() {
        return this.dataPattern;
    }

    @m
    /* renamed from: p, reason: from getter */
    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void q(@m String str) {
        this.action = str;
    }

    public final void r(@m kotlin.reflect.d<? extends Activity> dVar) {
        this.activityClass = dVar;
    }

    public final void s(@m Uri uri) {
        this.data = uri;
    }

    public final void t(@m String str) {
        this.dataPattern = str;
    }

    public final void u(@m String str) {
        this.targetPackage = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l d navigator, @l String route) {
        super(navigator, route);
        l0.p(navigator, "navigator");
        l0.p(route, "route");
        this.context = navigator.getContext();
    }
}
