package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.credentials.CredentialEntry;
import androidx.annotation.c1;
import androidx.credentials.t1;
import java.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CustomCredentialEntry.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 12\u00020\u0001:\u0004<=>?B\u0095\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019Ba\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u001cBu\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010+R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0017\u00109\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b8\u0010-R\u0011\u0010;\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b:\u0010-¨\u0006@"}, d2 = {"Landroidx/credentials/provider/q0;", "Landroidx/credentials/provider/f0;", "", "type", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "", "isAutoSelectAllowed", "subtitle", "typeDisplayName", "Landroid/graphics/drawable/Icon;", "icon", "Ljava/time/Instant;", "lastUsedTime", "Landroidx/credentials/provider/u;", "beginGetCredentialOption", "isDefaultIconPreferredAsSingleProvider", "entryGroupId", "affiliatedDomain", "autoSelectAllowedFromOption", "isCreatedFromSlice", "isDefaultIconFromSlice", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Landroid/app/PendingIntent;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/time/Instant;Landroidx/credentials/provider/u;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;ZZZ)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/u;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/u;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZLjava/lang/CharSequence;Z)V", "g", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "h", "Ljava/lang/CharSequence;", "q", "()Ljava/lang/CharSequence;", "i", "Landroid/app/PendingIntent;", "o", "()Landroid/app/PendingIntent;", "j", "Z", "t", "()Z", "k", "p", "l", "r", "m", "Landroid/graphics/drawable/Icon;", "()Landroid/graphics/drawable/Icon;", "n", "Ljava/time/Instant;", "()Ljava/time/Instant;", "u", "isAutoSelectAllowedFromOption", "s", "hasDefaultIcon", "a", "b", "c", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
@kotlin.jvm.internal.r1({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,645:1\n1#2:646\n*E\n"})
/* loaded from: classes3.dex */
public final class q0 extends f0 {
    private static final int I = 1;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String type;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence title;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence subtitle;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence typeDisplayName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Icon icon;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Instant lastUsedTime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isCreatedFromSlice;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isDefaultIconFromSlice;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowedFromOption;

    @fg.l
    private static final String A = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";

    @fg.l
    private static final String B = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    @fg.l
    private static final String C = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    @fg.l
    private static final String D = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";

    @fg.l
    private static final String E = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";

    @fg.l
    private static final String F = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    @fg.l
    private static final String G = "true";

    @fg.l
    private static final String H = "false";

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final String f28112s = "CredentialEntry";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final String f28113t = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final String f28114u = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final String f28115v = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final String f28116w = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private static final String f28117x = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final String f28118y = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final String f28119z = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/q0$a;", "", "<init>", "()V", "Landroidx/credentials/provider/q0;", "entry", "", "b", "(Landroidx/credentials/provider/q0;)Z", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/q0;)Landroid/app/slice/Slice;", "slice", "a", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/q0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(28)
    @kotlin.jvm.internal.r1({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,645:1\n1855#2,2:646\n*S KotlinDebug\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Api28Impl\n*L\n373#1:646,2\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28131a = new a();

        private a() {
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final q0 a(@fg.l Slice slice) {
            Iterator it;
            kotlin.jvm.internal.l0.p(slice, "slice");
            SliceSpec spec = slice.getSpec();
            kotlin.jvm.internal.l0.m(spec);
            String type = spec.getType();
            kotlin.jvm.internal.l0.o(type, "slice.spec!!.type");
            List<SliceItem> items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            Iterator it2 = items.iterator();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            PendingIntent pendingIntent = null;
            CharSequence charSequence3 = null;
            CharSequence charSequence4 = null;
            Icon icon = null;
            Instant instant = null;
            CharSequence charSequence5 = null;
            CharSequence charSequence6 = null;
            while (it2.hasNext()) {
                SliceItem sliceItem = (SliceItem) it2.next();
                if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                    charSequence4 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                    charSequence3 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else {
                    it = it2;
                    if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                        if (kotlin.jvm.internal.l0.g(sliceItem.getText(), "true")) {
                            z4 = true;
                        }
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                        charSequence5 = sliceItem.getText();
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                        z6 = true;
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                        if (kotlin.jvm.internal.l0.g(sliceItem.getText(), "true")) {
                            z5 = true;
                        }
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                        z7 = true;
                    } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                        charSequence6 = sliceItem.getText();
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            try {
                kotlin.jvm.internal.l0.m(charSequence2);
                kotlin.jvm.internal.l0.m(pendingIntent);
                kotlin.jvm.internal.l0.m(icon);
                kotlin.jvm.internal.l0.m(charSequence);
                return new q0(type, charSequence2, pendingIntent, z4, charSequence3, charSequence4, icon, instant, new x(charSequence.toString(), type, new Bundle()), z5, charSequence5, charSequence6, z6, true, z7);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final boolean b(@fg.l q0 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            return entry.isCreatedFromSlice ? entry.isDefaultIconFromSlice : entry.getIcon().getType() == 2 && entry.getIcon().getResId() == t1.a.f28278a;
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final Slice c(@fg.l q0 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            String type = entry.getType();
            CharSequence title = entry.getTitle();
            CharSequence subtitle = entry.getSubtitle();
            PendingIntent pendingIntent = entry.getPendingIntent();
            CharSequence typeDisplayName = entry.getTypeDisplayName();
            Instant lastUsedTime = entry.getLastUsedTime();
            Icon icon = entry.getIcon();
            boolean isAutoSelectAllowed = entry.getIsAutoSelectAllowed();
            u beginGetCredentialOption = entry.getBeginGetCredentialOption();
            CharSequence entryGroupId = entry.getEntryGroupId();
            CharSequence affiliatedDomain = entry.getAffiliatedDomain();
            boolean isDefaultIconPreferredAsSingleProvider = entry.getIsDefaultIconPreferredAsSingleProvider();
            Slice.Builder addText = new Slice.Builder(Uri.EMPTY, new SliceSpec(type, 1)).addText(typeDisplayName, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(title, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(subtitle, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(isAutoSelectAllowed ? "true" : "false", null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.getId(), null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addText(entryGroupId, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")).addText(affiliatedDomain, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")).addIcon(icon, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")).addText(isDefaultIconPreferredAsSingleProvider ? "true" : "false", null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
            try {
                if (entry.s()) {
                    addText.addInt(1, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID"));
                }
            } catch (IllegalStateException unused) {
            }
            if (entry.getIsAutoSelectAllowedFromOption()) {
                addText.addInt(1, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION"));
            }
            if (lastUsedTime != null) {
                addText.addLong(lastUsedTime.toEpochMilli(), null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            addText.addAction(pendingIntent, new Slice.Builder(addText).addHints(Collections.singletonList("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            Slice build = addText.build();
            kotlin.jvm.internal.l0.o(build, "sliceBuilder.build()");
            return build;
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/q0$b;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "Landroidx/credentials/provider/q0;", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/q0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f28132a = new b();

        private b() {
        }

        @fg.m
        @kd.n
        public static final q0 a(@fg.l CredentialEntry credentialEntry) {
            kotlin.jvm.internal.l0.p(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            kotlin.jvm.internal.l0.o(slice, "credentialEntry.slice");
            return q0.INSTANCE.b(slice);
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0016\u0010!\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/¨\u00062"}, d2 = {"Landroidx/credentials/provider/q0$c;", "", "Landroid/content/Context;", "context", "", "type", "", "title", "Landroid/app/PendingIntent;", "pendingIntent", "Landroidx/credentials/provider/u;", "beginGetCredentialOption", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/u;)V", "subtitle", "g", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/q0$c;", "typeDisplayName", "h", "Landroid/graphics/drawable/Icon;", "icon", "e", "(Landroid/graphics/drawable/Icon;)Landroidx/credentials/provider/q0$c;", "", "autoSelectAllowed", "b", "(Z)Landroidx/credentials/provider/q0$c;", "entryGroupId", "d", "Ljava/time/Instant;", "lastUsedTime", "f", "(Ljava/time/Instant;)Landroidx/credentials/provider/q0$c;", "isDefaultIconPreferredAsSingleProvider", "c", "Landroidx/credentials/provider/q0;", "a", "()Landroidx/credentials/provider/q0;", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "Landroidx/credentials/provider/u;", "Ljava/time/Instant;", "i", "Landroid/graphics/drawable/Icon;", "j", "Z", "k", "l", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nCustomCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomCredentialEntry.kt\nandroidx/credentials/provider/CustomCredentialEntry$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,645:1\n1#2:646\n*E\n"})
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence title;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final u beginGetCredentialOption;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence subtitle;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Instant lastUsedTime;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence typeDisplayName;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Icon icon;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean autoSelectAllowed;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private CharSequence entryGroupId;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean isDefaultIconPreferredAsSingleProvider;

        public c(@fg.l Context context, @fg.l String type, @fg.l CharSequence title, @fg.l PendingIntent pendingIntent, @fg.l u beginGetCredentialOption) {
            kotlin.jvm.internal.l0.p(context, "context");
            kotlin.jvm.internal.l0.p(type, "type");
            kotlin.jvm.internal.l0.p(title, "title");
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            kotlin.jvm.internal.l0.p(beginGetCredentialOption, "beginGetCredentialOption");
            this.context = context;
            this.type = type;
            this.title = title;
            this.pendingIntent = pendingIntent;
            this.beginGetCredentialOption = beginGetCredentialOption;
            this.entryGroupId = title;
        }

        @fg.l
        public final q0 a() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, t1.a.f28278a);
            }
            String str = this.type;
            CharSequence charSequence = this.title;
            PendingIntent pendingIntent = this.pendingIntent;
            boolean z4 = this.autoSelectAllowed;
            CharSequence charSequence2 = this.subtitle;
            CharSequence charSequence3 = this.typeDisplayName;
            Icon icon = this.icon;
            kotlin.jvm.internal.l0.m(icon);
            return new q0(str, charSequence, pendingIntent, z4, charSequence2, charSequence3, icon, this.lastUsedTime, this.beginGetCredentialOption, this.isDefaultIconPreferredAsSingleProvider, this.entryGroupId, null, false, false, false, 30720, null);
        }

        @fg.l
        public final c b(boolean autoSelectAllowed) {
            this.autoSelectAllowed = autoSelectAllowed;
            return this;
        }

        @fg.l
        public final c c(boolean isDefaultIconPreferredAsSingleProvider) {
            this.isDefaultIconPreferredAsSingleProvider = isDefaultIconPreferredAsSingleProvider;
            return this;
        }

        @fg.l
        public final c d(@fg.l CharSequence entryGroupId) {
            kotlin.jvm.internal.l0.p(entryGroupId, "entryGroupId");
            if (entryGroupId.length() <= 0) {
                throw new IllegalArgumentException("entryGroupId must not be empty");
            }
            this.entryGroupId = entryGroupId;
            return this;
        }

        @fg.l
        public final c e(@fg.l Icon icon) {
            kotlin.jvm.internal.l0.p(icon, "icon");
            this.icon = icon;
            return this;
        }

        @fg.l
        public final c f(@fg.m Instant lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }

        @fg.l
        public final c g(@fg.m CharSequence subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @fg.l
        public final c h(@fg.m CharSequence typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            return this;
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Landroidx/credentials/provider/q0$d;", "", "<init>", "()V", "Landroidx/credentials/provider/q0;", "entry", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/q0;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/q0;", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/q0;", "", "FALSE_STRING", "Ljava/lang/String;", "", "REVISION_ID", "I", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TAG", "TRUE_STRING", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.q0$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final q0 a(@fg.l CredentialEntry credentialEntry) {
            kotlin.jvm.internal.l0.p(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return b.a(credentialEntry);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final q0 b(@fg.l Slice slice) {
            kotlin.jvm.internal.l0.p(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.a(slice);
            }
            return null;
        }

        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final Slice c(@fg.l q0 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.c(entry);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ q0(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z4, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, u uVar, boolean z5, CharSequence charSequence4, CharSequence charSequence5, boolean z6, boolean z7, boolean z10, int i4, kotlin.jvm.internal.w wVar) {
        this(str, charSequence, pendingIntent, z4, charSequence2, charSequence3, icon, instant, uVar, z5, (i4 & 1024) != 0 ? charSequence : charSequence4, (i4 & 2048) != 0 ? null : charSequence5, (i4 & 4096) != 0 ? androidx.credentials.o.INSTANCE.b(uVar.getCandidateQueryData()) : z6, (i4 & 8192) != 0 ? false : z7, (i4 & 16384) != 0 ? false : z10);
    }

    @fg.m
    @kd.n
    public static final q0 k(@fg.l CredentialEntry credentialEntry) {
        return INSTANCE.a(credentialEntry);
    }

    @SuppressLint({"WrongConstant"})
    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final q0 l(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final Slice v(@fg.l q0 q0Var) {
        return INSTANCE.c(q0Var);
    }

    @Override // androidx.credentials.provider.f0
    @fg.l
    /* renamed from: f, reason: from getter */
    public String getType() {
        return this.type;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @fg.m
    /* renamed from: p, reason: from getter */
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    @kd.i(name = "hasDefaultIcon")
    public final boolean s() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this);
        }
        return false;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsAutoSelectAllowedFromOption() {
        return this.isAutoSelectAllowedFromOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@fg.l String type, @fg.l CharSequence title, @fg.l PendingIntent pendingIntent, boolean z4, @fg.m CharSequence charSequence, @fg.m CharSequence charSequence2, @fg.l Icon icon, @fg.m Instant instant, @fg.l u beginGetCredentialOption, boolean z5, @fg.m CharSequence charSequence3, @fg.m CharSequence charSequence4, boolean z6, boolean z7, boolean z10) {
        super(type, beginGetCredentialOption, charSequence3 == null ? title : charSequence3, z5, charSequence4);
        kotlin.jvm.internal.l0.p(type, "type");
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        kotlin.jvm.internal.l0.p(icon, "icon");
        kotlin.jvm.internal.l0.p(beginGetCredentialOption, "beginGetCredentialOption");
        this.type = type;
        this.title = title;
        this.pendingIntent = pendingIntent;
        this.isAutoSelectAllowed = z4;
        this.subtitle = charSequence;
        this.typeDisplayName = charSequence2;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isCreatedFromSlice = z7;
        this.isDefaultIconFromSlice = z10;
        this.isAutoSelectAllowedFromOption = z6;
        if (type.length() > 0) {
            if (title.length() <= 0) {
                throw new IllegalArgumentException("title must not be empty");
            }
            return;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q0(android.content.Context r14, java.lang.CharSequence r15, android.app.PendingIntent r16, androidx.credentials.provider.u r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.time.Instant r20, android.graphics.drawable.Icon r21, boolean r22, int r23, kotlin.jvm.internal.w r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r18
        Lb:
            r1 = r0 & 32
            if (r1 == 0) goto L11
            r9 = r2
            goto L13
        L11:
            r9 = r19
        L13:
            r1 = r0 & 64
            if (r1 == 0) goto L19
            r10 = r2
            goto L1b
        L19:
            r10 = r20
        L1b:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2d
            int r1 = androidx.credentials.t1.a.f28278a
            r2 = r14
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r14, r1)
            java.lang.String r3 = "createWithResource(conte…rawable.ic_other_sign_in)"
            kotlin.jvm.internal.l0.o(r1, r3)
            r11 = r1
            goto L30
        L2d:
            r2 = r14
            r11 = r21
        L30:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L37
            r0 = 0
            r12 = r0
            goto L39
        L37:
            r12 = r22
        L39:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.q0.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.u, java.lang.CharSequence, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the constructor that allows setting all parameters.", replaceWith = @kotlin.x0(expression = "CustomCredentialEntry(context, title, pendingIntent,beginGetCredentialOption, subtitle, typeDisplayName, lastUsedTime, icon, isAutoSelectAllowed, entryGroupId, isDefaultIconPreferredAsSingleProvider)", imports = {}))
    public /* synthetic */ q0(Context context, CharSequence title, PendingIntent pendingIntent, u beginGetCredentialOption, CharSequence charSequence, CharSequence charSequence2, Instant instant, Icon icon, boolean z4) {
        this(beginGetCredentialOption.getType(), title, pendingIntent, z4, charSequence, charSequence2, icon, instant, beginGetCredentialOption, false, null, null, false, false, false, 31744, null);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        kotlin.jvm.internal.l0.p(beginGetCredentialOption, "beginGetCredentialOption");
        kotlin.jvm.internal.l0.p(icon, "icon");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ q0(android.content.Context r16, java.lang.CharSequence r17, android.app.PendingIntent r18, androidx.credentials.provider.u r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.time.Instant r22, android.graphics.drawable.Icon r23, boolean r24, java.lang.CharSequence r25, boolean r26, int r27, kotlin.jvm.internal.w r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r20
        Lb:
            r1 = r0 & 32
            if (r1 == 0) goto L11
            r9 = r2
            goto L13
        L11:
            r9 = r21
        L13:
            r1 = r0 & 64
            if (r1 == 0) goto L19
            r10 = r2
            goto L1b
        L19:
            r10 = r22
        L1b:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2e
            int r1 = androidx.credentials.t1.a.f28278a
            r2 = r16
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r2, r1)
            java.lang.String r3 = "createWithResource(conte…rawable.ic_other_sign_in)"
            kotlin.jvm.internal.l0.o(r1, r3)
            r11 = r1
            goto L32
        L2e:
            r2 = r16
            r11 = r23
        L32:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L39
            r12 = r3
            goto L3b
        L39:
            r12 = r24
        L3b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L42
            r13 = r17
            goto L44
        L42:
            r13 = r25
        L44:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4a
            r14 = r3
            goto L4c
        L4a:
            r14 = r26
        L4c:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.q0.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.u, java.lang.CharSequence, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean, java.lang.CharSequence, boolean, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@fg.l Context context, @fg.l CharSequence title, @fg.l PendingIntent pendingIntent, @fg.l u beginGetCredentialOption, @fg.m CharSequence charSequence, @fg.m CharSequence charSequence2, @fg.m Instant instant, @fg.l Icon icon, boolean z4, @fg.l CharSequence entryGroupId, boolean z5) {
        this(beginGetCredentialOption.getType(), title, pendingIntent, z4, charSequence, charSequence2, icon, instant, beginGetCredentialOption, z5, entryGroupId.length() == 0 ? title : entryGroupId, null, false, false, false, 30720, null);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(title, "title");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        kotlin.jvm.internal.l0.p(beginGetCredentialOption, "beginGetCredentialOption");
        kotlin.jvm.internal.l0.p(icon, "icon");
        kotlin.jvm.internal.l0.p(entryGroupId, "entryGroupId");
    }
}
