package androidx.content;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.i;
import androidx.content.c1;
import androidx.content.f0;
import androidx.content.i1;
import androidx.core.app.e;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import kotlin.text.v;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: ActivityNavigator.kt */
@c1.b("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/navigation/d;", "Landroidx/navigation/c1;", "Landroidx/navigation/d$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "m", "()Landroidx/navigation/d$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/t0;", "navOptions", "Landroidx/navigation/c1$a;", "navigatorExtras", "Landroidx/navigation/f0;", "o", "(Landroidx/navigation/d$b;Landroid/os/Bundle;Landroidx/navigation/t0;Landroidx/navigation/c1$a;)Landroidx/navigation/f0;", "c", "Landroid/content/Context;", "n", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class d extends c1<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final android.content.Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Activity hostActivity;

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final String f31019f = "android-support-navigation:ActivityNavigator:source";

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final String f31020g = "android-support-navigation:ActivityNavigator:current";

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final String f31021h = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final String f31022i = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final String f31023j = "ActivityNavigator";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/navigation/d$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lkotlin/k2;", "a", "(Landroid/app/Activity;)V", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @n
        public final void a(@l Activity activity) {
            l0.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
            int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010(R(\u0010:\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8F@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010(R(\u0010?\u001a\u0004\u0018\u00010\u001a2\b\u00100\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u00100\u001a\u0004\u0018\u00010\r8F@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010(R(\u0010!\u001a\u0004\u0018\u00010 2\b\u00100\u001a\u0004\u0018\u00010 8F@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Landroidx/navigation/d$b;", "Landroidx/navigation/f0;", "Landroidx/navigation/c1;", "activityNavigator", "<init>", "(Landroidx/navigation/c1;)V", "Landroidx/navigation/d1;", "navigatorProvider", "(Landroidx/navigation/d1;)V", "Landroid/content/Intent;", "intent", "l0", "(Landroid/content/Intent;)Landroidx/navigation/d$b;", "", "dataPattern", "k0", "(Ljava/lang/String;)Landroidx/navigation/d$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/k2;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "packageName", "m0", "Landroid/content/ComponentName;", "name", "i0", "(Landroid/content/ComponentName;)Landroidx/navigation/d$b;", "action", "h0", "Landroid/net/Uri;", "data", "j0", "(Landroid/net/Uri;)Landroidx/navigation/d$b;", "", "Z", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<set-?>", "m", "Landroid/content/Intent;", "f0", "()Landroid/content/Intent;", "n", "Ljava/lang/String;", "e0", "o", "g0", "targetPackage", "p", "Landroid/content/ComponentName;", "b0", "()Landroid/content/ComponentName;", "component", "q", "a0", "r", "Landroid/net/Uri;", "d0", "()Landroid/net/Uri;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @f0.a(Activity.class)
    public static class b extends f0 {

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @m
        private Intent intent;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @m
        private String dataPattern;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @m
        private String targetPackage;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @m
        private ComponentName component;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @m
        private String action;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @m
        private Uri data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l c1<? extends b> activityNavigator) {
            super(activityNavigator);
            l0.p(activityNavigator, "activityNavigator");
        }

        @Override // androidx.content.f0
        @i
        public void L(@l android.content.Context context, @l AttributeSet attrs) {
            l0.p(context, "context");
            l0.p(attrs, "attrs");
            super.L(context, attrs);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, i1.c.f31145a);
            l0.o(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(i1.c.f31150f);
            if (string != null) {
                String packageName = context.getPackageName();
                l0.o(packageName, "context.packageName");
                string = v.i2(string, "${applicationId}", packageName, false, 4, null);
            }
            m0(string);
            String string2 = obtainAttributes.getString(i1.c.f31146b);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = l0.C(context.getPackageName(), string2);
                }
                i0(new ComponentName(context, string2));
            }
            h0(obtainAttributes.getString(i1.c.f31147c));
            String string3 = obtainAttributes.getString(i1.c.f31148d);
            if (string3 != null) {
                j0(Uri.parse(string3));
            }
            this.dataPattern = obtainAttributes.getString(i1.c.f31149e);
            obtainAttributes.recycle();
        }

        @Override // androidx.content.f0
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
        public boolean Z() {
            return false;
        }

        @m
        public final String a0() {
            Intent intent = this.intent;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        @m
        public final ComponentName b0() {
            Intent intent = this.intent;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        @m
        public final Uri d0() {
            Intent intent = this.intent;
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }

        @m
        /* renamed from: e0, reason: from getter */
        public final String getDataPattern() {
            return this.dataPattern;
        }

        @Override // androidx.content.f0
        public boolean equals(@m Object other) {
            if (other == null || !(other instanceof b) || !super.equals(other)) {
                return false;
            }
            Intent intent = this.intent;
            Boolean valueOf = intent == null ? null : Boolean.valueOf(intent.filterEquals(((b) other).intent));
            return (valueOf == null ? ((b) other).intent == null : valueOf.booleanValue()) && l0.g(this.dataPattern, ((b) other).dataPattern);
        }

        @m
        /* renamed from: f0, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @m
        public final String g0() {
            Intent intent = this.intent;
            if (intent == null) {
                return null;
            }
            return intent.getPackage();
        }

        @l
        public final b h0(@m String action) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setAction(action);
            return this;
        }

        @Override // androidx.content.f0
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int filterHashCode = (hashCode + (intent == null ? 0 : intent.filterHashCode())) * 31;
            String str = this.dataPattern;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @l
        public final b i0(@m ComponentName name) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setComponent(name);
            return this;
        }

        @l
        public final b j0(@m Uri data) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setData(data);
            return this;
        }

        @l
        public final b k0(@m String dataPattern) {
            this.dataPattern = dataPattern;
            return this;
        }

        @l
        public final b l0(@m Intent intent) {
            this.intent = intent;
            return this;
        }

        @l
        public final b m0(@m String packageName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            l0.m(intent);
            intent.setPackage(packageName);
            return this;
        }

        @Override // androidx.content.f0
        @l
        public String toString() {
            ComponentName b02 = b0();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (b02 != null) {
                sb.append(" class=");
                sb.append(b02.getClassName());
            } else {
                String a02 = a0();
                if (a02 != null) {
                    sb.append(" action=");
                    sb.append(a02);
                }
            }
            String sb2 = sb.toString();
            l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@l d1 navigatorProvider) {
            this((c1<? extends b>) navigatorProvider.e(d.class));
            l0.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/navigation/d$c;", "Landroidx/navigation/c1$a;", "", "flags", "Landroidx/core/app/e;", "activityOptions", "<init>", "(ILandroidx/core/app/e;)V", "a", "I", "b", "()I", "Landroidx/core/app/e;", "()Landroidx/core/app/e;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c implements c1.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private final e activityOptions;

        /* compiled from: ActivityNavigator.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/navigation/d$c$a;", "", "<init>", "()V", "", "flags", "a", "(I)Landroidx/navigation/d$c$a;", "Landroidx/core/app/e;", "activityOptions", "c", "(Landroidx/core/app/e;)Landroidx/navigation/d$c$a;", "Landroidx/navigation/d$c;", "b", "()Landroidx/navigation/d$c;", "I", "Landroidx/core/app/e;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int flags;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @m
            private e activityOptions;

            @l
            public final a a(int flags) {
                this.flags = flags | this.flags;
                return this;
            }

            @l
            public final c b() {
                return new c(this.flags, this.activityOptions);
            }

            @l
            public final a c(@l e activityOptions) {
                l0.p(activityOptions, "activityOptions");
                this.activityOptions = activityOptions;
                return this;
            }
        }

        public c(int i4, @m e eVar) {
            this.flags = i4;
            this.activityOptions = eVar;
        }

        @m
        /* renamed from: a, reason: from getter */
        public final e getActivityOptions() {
            return this.activityOptions;
        }

        /* renamed from: b, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.navigation.d$d, reason: from Kotlin metadata */
    static final class Context extends n0 implements ld.l<android.content.Context, android.content.Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final Context f31036b = new Context(1);

        Context() {
            super(1);
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.content.Context invoke(@l android.content.Context it) {
            l0.p(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public d(@l android.content.Context context) {
        Object obj;
        l0.p(context, "context");
        this.context = context;
        Iterator it = p.l(context, Context.f31036b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @n
    public static final void l(@l Activity activity) {
        INSTANCE.a(activity);
    }

    @Override // androidx.content.c1
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.content.c1
    @l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    /* renamed from: n, reason: from getter */
    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // androidx.content.c1
    @m
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public f0 d(@l b destination, @m Bundle args, @m t0 navOptions, @m c1.a navigatorExtras) {
        Intent intent;
        int intExtra;
        l0.p(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!args.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + ((Object) group) + " in " + args + " to fill data pattern " + ((Object) dataPattern));
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z4 = navigatorExtras instanceof c;
        if (z4) {
            intent2.addFlags(((c) navigatorExtras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(ClientDefaults.MAX_MSG_SIZE);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !l0.g(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !l0.g(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            } else {
                resources.getResourceName(popEnterAnim);
                resources.getResourceName(popExitAnim);
                destination.toString();
            }
        }
        if (z4) {
            e activityOptions = ((c) navigatorExtras).getActivityOptions();
            if (activityOptions != null) {
                androidx.core.content.d.startActivity(this.context, intent2, activityOptions.n());
            } else {
                this.context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int enterAnim = navOptions.getEnterAnim();
        int exitAnim = navOptions.getExitAnim();
        if ((enterAnim > 0 && l0.g(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && l0.g(resources.getResourceTypeName(exitAnim), "animator"))) {
            resources.getResourceName(enterAnim);
            resources.getResourceName(exitAnim);
            destination.toString();
            return null;
        }
        if (enterAnim < 0 && exitAnim < 0) {
            return null;
        }
        if (enterAnim < 0) {
            enterAnim = 0;
        }
        this.hostActivity.overridePendingTransition(enterAnim, exitAnim >= 0 ? exitAnim : 0);
        return null;
    }
}
