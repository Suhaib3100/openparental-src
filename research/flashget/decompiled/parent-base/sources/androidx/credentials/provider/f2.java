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
import androidx.credentials.provider.z;
import androidx.credentials.t1;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublicKeyCredentialEntry.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004789:B\u008b\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017B_\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u001aBU\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u0017\u00104\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b3\u00102R\u0011\u00106\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b5\u00102¨\u0006;"}, d2 = {"Landroidx/credentials/provider/f2;", "Landroidx/credentials/provider/f0;", "", "username", "displayName", "typeDisplayName", "Landroid/app/PendingIntent;", "pendingIntent", "Landroid/graphics/drawable/Icon;", "icon", "Ljava/time/Instant;", "lastUsedTime", "", "isAutoSelectAllowed", "Landroidx/credentials/provider/z;", "beginGetPublicKeyCredentialOption", "isDefaultIconPreferredAsSingleProvider", "entryGroupId", "affiliatedDomain", "autoSelectAllowedFromOption", "isCreatedFromSlice", "isDefaultIconFromSlice", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;Ljava/time/Instant;ZLandroidx/credentials/provider/z;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;ZZZ)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/z;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;ZZ)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/z;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "g", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "h", "m", "i", "q", "j", "Landroid/app/PendingIntent;", "p", "()Landroid/app/PendingIntent;", "k", "Landroid/graphics/drawable/Icon;", "n", "()Landroid/graphics/drawable/Icon;", "l", "Ljava/time/Instant;", "o", "()Ljava/time/Instant;", "Z", "t", "()Z", "u", "isAutoSelectAllowedFromOption", "s", "hasDefaultIcon", "a", "b", "c", "d", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
@kotlin.jvm.internal.r1({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,601:1\n1#2:602\n*E\n"})
/* loaded from: classes3.dex */
public final class f2 extends f0 {
    private static final int H = 1;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence username;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence displayName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence typeDisplayName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Icon icon;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Instant lastUsedTime;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isCreatedFromSlice;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultIconFromSlice;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowedFromOption;

    @fg.l
    private static final String A = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";

    @fg.l
    private static final String B = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";

    @fg.l
    private static final String C = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";

    @fg.l
    private static final String D = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";

    @fg.l
    private static final String E = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";

    @fg.l
    private static final String F = "true";

    @fg.l
    private static final String G = "false";

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final String f28049r = "PublicKeyCredEntry";

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final String f28050s = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final String f28051t = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final String f28052u = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final String f28053v = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final String f28054w = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private static final String f28055x = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final String f28056y = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final String f28057z = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/f2$a;", "", "<init>", "()V", "Landroidx/credentials/provider/f2;", "entry", "", "b", "(Landroidx/credentials/provider/f2;)Z", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/f2;)Landroid/app/slice/Slice;", "slice", "a", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/f2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(28)
    @kotlin.jvm.internal.r1({"SMAP\nPublicKeyCredentialEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,601:1\n1855#2,2:602\n*S KotlinDebug\n*F\n+ 1 PublicKeyCredentialEntry.kt\nandroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl\n*L\n364#1:602,2\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28068a = new a();

        private a() {
        }

        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final f2 a(@fg.l Slice slice) {
            kotlin.jvm.internal.l0.p(slice, "slice");
            List<SliceItem> items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            CharSequence charSequence4 = null;
            PendingIntent pendingIntent = null;
            Icon icon = null;
            Instant instant = null;
            CharSequence charSequence5 = null;
            CharSequence charSequence6 = null;
            for (SliceItem sliceItem : items) {
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
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                    if (kotlin.jvm.internal.l0.g(sliceItem.getText(), "true")) {
                        z4 = true;
                    }
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                    z6 = true;
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED")) {
                    if (kotlin.jvm.internal.l0.g(sliceItem.getText(), "true")) {
                        z5 = true;
                    }
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID")) {
                    z7 = true;
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")) {
                    charSequence5 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")) {
                    charSequence6 = sliceItem.getText();
                }
            }
            try {
                kotlin.jvm.internal.l0.m(charSequence2);
                kotlin.jvm.internal.l0.m(charSequence4);
                kotlin.jvm.internal.l0.m(pendingIntent);
                kotlin.jvm.internal.l0.m(icon);
                z.Companion companion = z.INSTANCE;
                Bundle bundle = new Bundle();
                kotlin.jvm.internal.l0.m(charSequence);
                return new f2(charSequence2, charSequence3, charSequence4, pendingIntent, icon, instant, z4, companion.b(bundle, charSequence.toString()), z5, charSequence5, charSequence6, z6, true, z7);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final boolean b(@fg.l f2 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            return entry.isCreatedFromSlice ? entry.isDefaultIconFromSlice : entry.getIcon().getType() == 2 && entry.getIcon().getResId() == t1.a.f28279b;
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final Slice c(@fg.l f2 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            String type = entry.getType();
            CharSequence username = entry.getUsername();
            CharSequence displayName = entry.getDisplayName();
            PendingIntent pendingIntent = entry.getPendingIntent();
            CharSequence typeDisplayName = entry.getTypeDisplayName();
            Instant lastUsedTime = entry.getLastUsedTime();
            Icon icon = entry.getIcon();
            boolean isAutoSelectAllowed = entry.getIsAutoSelectAllowed();
            u beginGetCredentialOption = entry.getBeginGetCredentialOption();
            CharSequence entryGroupId = entry.getEntryGroupId();
            CharSequence affiliatedDomain = entry.getAffiliatedDomain();
            boolean isDefaultIconPreferredAsSingleProvider = entry.getIsDefaultIconPreferredAsSingleProvider();
            Slice.Builder addText = new Slice.Builder(Uri.EMPTY, new SliceSpec(type, 1)).addText(typeDisplayName, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")).addText(username, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")).addText(displayName, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")).addText(isAutoSelectAllowed ? "true" : "false", null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")).addText(beginGetCredentialOption.getId(), null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")).addIcon(icon, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")).addText(entryGroupId, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID")).addText(affiliatedDomain, null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN")).addText(isDefaultIconPreferredAsSingleProvider ? "true" : "false", null, kotlin.collections.w.k("androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED"));
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

    /* compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/f2$b;", "", "<init>", "()V", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "Landroidx/credentials/provider/f2;", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/f2;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f28069a = new b();

        private b() {
        }

        @fg.m
        @kd.n
        public static final f2 a(@fg.l CredentialEntry credentialEntry) {
            kotlin.jvm.internal.l0.p(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            kotlin.jvm.internal.l0.o(slice, "credentialEntry.slice");
            return f2.INSTANCE.b(slice);
        }
    }

    /* compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Landroidx/credentials/provider/f2$c;", "", "Landroid/content/Context;", "context", "", "username", "Landroid/app/PendingIntent;", "pendingIntent", "Landroidx/credentials/provider/z;", "beginGetPublicKeyCredentialOption", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/z;)V", "displayName", "d", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/f2$c;", "Landroid/graphics/drawable/Icon;", "icon", "e", "(Landroid/graphics/drawable/Icon;)Landroidx/credentials/provider/f2$c;", "", "autoSelectAllowed", "b", "(Z)Landroidx/credentials/provider/f2$c;", "Ljava/time/Instant;", "lastUsedTime", "f", "(Ljava/time/Instant;)Landroidx/credentials/provider/f2$c;", "isDefaultIconPreferredAsSingleProvider", "c", "Landroidx/credentials/provider/f2;", "a", "()Landroidx/credentials/provider/f2;", "Landroid/content/Context;", "Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "Landroidx/credentials/provider/z;", "Ljava/time/Instant;", "g", "Landroid/graphics/drawable/Icon;", "h", "Z", "i", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence username;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final z beginGetPublicKeyCredentialOption;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence displayName;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Instant lastUsedTime;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Icon icon;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean autoSelectAllowed;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isDefaultIconPreferredAsSingleProvider;

        public c(@fg.l Context context, @fg.l CharSequence username, @fg.l PendingIntent pendingIntent, @fg.l z beginGetPublicKeyCredentialOption) {
            kotlin.jvm.internal.l0.p(context, "context");
            kotlin.jvm.internal.l0.p(username, "username");
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            kotlin.jvm.internal.l0.p(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
            this.context = context;
            this.username = username;
            this.pendingIntent = pendingIntent;
            this.beginGetPublicKeyCredentialOption = beginGetPublicKeyCredentialOption;
        }

        @fg.l
        public final f2 a() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, t1.a.f28279b);
            }
            String string = this.context.getString(t1.b.f28282b);
            kotlin.jvm.internal.l0.o(string, "context.getString(R.stri…PE_PUBLIC_KEY_CREDENTIAL)");
            CharSequence charSequence = this.username;
            CharSequence charSequence2 = this.displayName;
            PendingIntent pendingIntent = this.pendingIntent;
            Icon icon = this.icon;
            kotlin.jvm.internal.l0.m(icon);
            return new f2(charSequence, charSequence2, string, pendingIntent, icon, this.lastUsedTime, this.autoSelectAllowed, this.beginGetPublicKeyCredentialOption, this.isDefaultIconPreferredAsSingleProvider, null, null, false, false, false, 15872, null);
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
        public final c d(@fg.m CharSequence displayName) {
            this.displayName = displayName;
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
    }

    /* compiled from: PublicKeyCredentialEntry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0012R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Landroidx/credentials/provider/f2$d;", "", "<init>", "()V", "Landroidx/credentials/provider/f2;", "entry", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/f2;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/f2;", "Landroid/service/credentials/CredentialEntry;", "credentialEntry", "a", "(Landroid/service/credentials/CredentialEntry;)Landroidx/credentials/provider/f2;", "", "FALSE_STRING", "Ljava/lang/String;", "", "REVISION_ID", "I", "SLICE_HINT_AFFILIATED_DOMAIN", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEDUPLICATION_ID", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_IS_DEFAULT_ICON_PREFERRED", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TAG", "TRUE_STRING", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.f2$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final f2 a(@fg.l CredentialEntry credentialEntry) {
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
        public final f2 b(@fg.l Slice slice) {
            kotlin.jvm.internal.l0.p(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.a(slice);
            }
            return null;
        }

        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final Slice c(@fg.l f2 entry) {
            kotlin.jvm.internal.l0.p(entry, "entry");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.c(entry);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ f2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z4, z zVar, boolean z5, CharSequence charSequence4, CharSequence charSequence5, boolean z6, boolean z7, boolean z10, int i4, kotlin.jvm.internal.w wVar) {
        this(charSequence, charSequence2, charSequence3, pendingIntent, icon, instant, z4, zVar, z5, (i4 & 512) != 0 ? charSequence : charSequence4, (i4 & 1024) != 0 ? null : charSequence5, (i4 & 2048) != 0 ? androidx.credentials.o.INSTANCE.b(zVar.getCandidateQueryData()) : z6, (i4 & 4096) != 0 ? false : z7, (i4 & 8192) != 0 ? false : z10);
    }

    @fg.m
    @kd.n
    public static final f2 k(@fg.l CredentialEntry credentialEntry) {
        return INSTANCE.a(credentialEntry);
    }

    @SuppressLint({"WrongConstant"})
    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final f2 l(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final Slice v(@fg.l f2 f2Var) {
        return INSTANCE.c(f2Var);
    }

    @fg.m
    /* renamed from: m, reason: from getter */
    public final CharSequence getDisplayName() {
        return this.displayName;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @fg.m
    /* renamed from: o, reason: from getter */
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final CharSequence getUsername() {
        return this.username;
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
    public f2(@fg.l CharSequence username, @fg.m CharSequence charSequence, @fg.l CharSequence typeDisplayName, @fg.l PendingIntent pendingIntent, @fg.l Icon icon, @fg.m Instant instant, boolean z4, @fg.l z beginGetPublicKeyCredentialOption, boolean z5, @fg.m CharSequence charSequence2, @fg.m CharSequence charSequence3, boolean z6, boolean z7, boolean z10) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", beginGetPublicKeyCredentialOption, charSequence2 == null ? username : charSequence2, z5, charSequence3);
        kotlin.jvm.internal.l0.p(username, "username");
        kotlin.jvm.internal.l0.p(typeDisplayName, "typeDisplayName");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        kotlin.jvm.internal.l0.p(icon, "icon");
        kotlin.jvm.internal.l0.p(beginGetPublicKeyCredentialOption, "beginGetPublicKeyCredentialOption");
        this.username = username;
        this.displayName = charSequence;
        this.typeDisplayName = typeDisplayName;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isAutoSelectAllowed = z4;
        this.isCreatedFromSlice = z7;
        this.isDefaultIconFromSlice = z10;
        this.isAutoSelectAllowedFromOption = z6;
        if (username.length() > 0) {
            if (typeDisplayName.length() <= 0) {
                throw new IllegalArgumentException("typeDisplayName must not be empty");
            }
            return;
        }
        throw new IllegalArgumentException("username must not be empty");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ f2(android.content.Context r14, java.lang.CharSequence r15, android.app.PendingIntent r16, androidx.credentials.provider.z r17, java.lang.CharSequence r18, java.time.Instant r19, android.graphics.drawable.Icon r20, boolean r21, boolean r22, int r23, kotlin.jvm.internal.w r24) {
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
            if (r1 == 0) goto L25
            int r1 = androidx.credentials.t1.a.f28279b
            r2 = r14
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r14, r1)
            java.lang.String r3 = "createWithResource(context, R.drawable.ic_passkey)"
            kotlin.jvm.internal.l0.o(r1, r3)
            r10 = r1
            goto L28
        L25:
            r2 = r14
            r10 = r20
        L28:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r1 == 0) goto L2f
            r11 = r3
            goto L31
        L2f:
            r11 = r21
        L31:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L37
            r12 = r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.f2.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.z, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean, boolean, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f2(@fg.l android.content.Context r19, @fg.l java.lang.CharSequence r20, @fg.l android.app.PendingIntent r21, @fg.l androidx.credentials.provider.z r22, @fg.m java.lang.CharSequence r23, @fg.m java.time.Instant r24, @fg.l android.graphics.drawable.Icon r25, boolean r26, boolean r27) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = r20
            r5 = r21
            r9 = r22
            r3 = r23
            r7 = r24
            r6 = r25
            r8 = r26
            r10 = r27
            java.lang.String r4 = "context"
            kotlin.jvm.internal.l0.p(r0, r4)
            java.lang.String r4 = "username"
            r11 = r20
            kotlin.jvm.internal.l0.p(r11, r4)
            java.lang.String r4 = "pendingIntent"
            r11 = r21
            kotlin.jvm.internal.l0.p(r11, r4)
            java.lang.String r4 = "beginGetPublicKeyCredentialOption"
            r11 = r22
            kotlin.jvm.internal.l0.p(r11, r4)
            java.lang.String r4 = "icon"
            r11 = r25
            kotlin.jvm.internal.l0.p(r11, r4)
            int r4 = androidx.credentials.t1.b.f28282b
            java.lang.String r0 = r0.getString(r4)
            r4 = r0
            java.lang.String r11 = "context.getString(R.stri…PE_PUBLIC_KEY_CREDENTIAL)"
            kotlin.jvm.internal.l0.o(r0, r11)
            r16 = 15872(0x3e00, float:2.2241E-41)
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.f2.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.z, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ f2(android.content.Context r13, java.lang.CharSequence r14, android.app.PendingIntent r15, androidx.credentials.provider.z r16, java.lang.CharSequence r17, java.time.Instant r18, android.graphics.drawable.Icon r19, boolean r20, int r21, kotlin.jvm.internal.w r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r17
        Lb:
            r1 = r0 & 32
            if (r1 == 0) goto L11
            r9 = r2
            goto L13
        L11:
            r9 = r18
        L13:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            int r1 = androidx.credentials.t1.a.f28279b
            r2 = r13
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithResource(r13, r1)
            java.lang.String r3 = "createWithResource(context, R.drawable.ic_passkey)"
            kotlin.jvm.internal.l0.o(r1, r3)
            r10 = r1
            goto L28
        L25:
            r2 = r13
            r10 = r19
        L28:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2f
            r0 = 0
            r11 = r0
            goto L31
        L2f:
            r11 = r20
        L31:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.f2.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.z, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the constructor that allows setting all parameters.", replaceWith = @kotlin.x0(expression = "PublicKeyCredentialEntry(context, username, pendingIntent,beginGetPublicKeyCredentialOption, displayName, lastUsedTime, icon, isAutoSelectAllowed, isDefaultIconPreferredAsSingleProvider)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ f2(android.content.Context r19, java.lang.CharSequence r20, android.app.PendingIntent r21, androidx.credentials.provider.z r22, java.lang.CharSequence r23, java.time.Instant r24, android.graphics.drawable.Icon r25, boolean r26) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = r20
            r5 = r21
            r9 = r22
            r3 = r23
            r7 = r24
            r6 = r25
            r8 = r26
            java.lang.String r4 = "context"
            kotlin.jvm.internal.l0.p(r0, r4)
            java.lang.String r4 = "username"
            r10 = r20
            kotlin.jvm.internal.l0.p(r10, r4)
            java.lang.String r4 = "pendingIntent"
            r10 = r21
            kotlin.jvm.internal.l0.p(r10, r4)
            java.lang.String r4 = "beginGetPublicKeyCredentialOption"
            r10 = r22
            kotlin.jvm.internal.l0.p(r10, r4)
            java.lang.String r4 = "icon"
            r10 = r25
            kotlin.jvm.internal.l0.p(r10, r4)
            int r4 = androidx.credentials.t1.b.f28282b
            java.lang.String r0 = r0.getString(r4)
            r4 = r0
            java.lang.String r10 = "context.getString(R.stri…PE_PUBLIC_KEY_CREDENTIAL)"
            kotlin.jvm.internal.l0.o(r0, r10)
            r16 = 15872(0x3e00, float:2.2241E-41)
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.f2.<init>(android.content.Context, java.lang.CharSequence, android.app.PendingIntent, androidx.credentials.provider.z, java.lang.CharSequence, java.time.Instant, android.graphics.drawable.Icon, boolean):void");
    }
}
