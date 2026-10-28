package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class AccountPicker {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class AccountChooserOptions {

        @q0
        private Account zza;
        private boolean zzb;

        @q0
        private ArrayList zzc;

        @q0
        private ArrayList zzd;
        private boolean zze;

        @q0
        private String zzf;

        @q0
        private Bundle zzg;
        private boolean zzh;
        private int zzi;

        @q0
        private String zzj;
        private boolean zzk;

        @q0
        private zza zzl;

        @q0
        private String zzm;
        private boolean zzn;
        private boolean zzo;

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class Builder {

            @q0
            private Account zza;

            @q0
            private ArrayList zzb;

            @q0
            private ArrayList zzc;
            private boolean zzd = false;

            @q0
            private String zze;

            @q0
            private Bundle zzf;

            @o0
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, ProtectedSandApp.s("ਘ"));
                Preconditions.checkArgument(true, ProtectedSandApp.s("ਙ"));
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzd = this.zzc;
                accountChooserOptions.zzc = this.zzb;
                accountChooserOptions.zze = this.zzd;
                accountChooserOptions.zzl = null;
                accountChooserOptions.zzj = null;
                accountChooserOptions.zzg = this.zzf;
                accountChooserOptions.zza = this.zza;
                accountChooserOptions.zzb = false;
                accountChooserOptions.zzh = false;
                accountChooserOptions.zzm = null;
                accountChooserOptions.zzi = 0;
                accountChooserOptions.zzf = this.zze;
                accountChooserOptions.zzk = false;
                accountChooserOptions.zzn = false;
                accountChooserOptions.zzo = false;
                return accountChooserOptions;
            }

            @o0
            @x1.a
            public Builder setAllowableAccounts(@q0 List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @o0
            @x1.a
            public Builder setAllowableAccountsTypes(@q0 List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @o0
            @x1.a
            public Builder setAlwaysShowAccountPicker(boolean z5) {
                this.zzd = z5;
                return this;
            }

            @o0
            @x1.a
            public Builder setOptionsForAddingAccount(@q0 Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @o0
            @x1.a
            public Builder setSelectedAccount(@q0 Account account) {
                this.zza = account;
                return this;
            }

            @o0
            @x1.a
            public Builder setTitleOverrideText(@q0 String str) {
                this.zze = str;
                return this;
            }
        }

        static /* bridge */ /* synthetic */ boolean zzA(AccountChooserOptions accountChooserOptions) {
            boolean z5 = accountChooserOptions.zzo;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzB(AccountChooserOptions accountChooserOptions) {
            boolean z5 = accountChooserOptions.zzb;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzC(AccountChooserOptions accountChooserOptions) {
            boolean z5 = accountChooserOptions.zzh;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzD(AccountChooserOptions accountChooserOptions) {
            boolean z5 = accountChooserOptions.zzk;
            return false;
        }

        static /* bridge */ /* synthetic */ int zza(AccountChooserOptions accountChooserOptions) {
            int i5 = accountChooserOptions.zzi;
            return 0;
        }

        static /* bridge */ /* synthetic */ zza zzd(AccountChooserOptions accountChooserOptions) {
            zza zzaVar = accountChooserOptions.zzl;
            return null;
        }

        static /* bridge */ /* synthetic */ String zze(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzj;
            return null;
        }

        static /* bridge */ /* synthetic */ String zzf(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.zzm;
            return null;
        }

        static /* bridge */ /* synthetic */ boolean zzz(AccountChooserOptions accountChooserOptions) {
            boolean z5 = accountChooserOptions.zzn;
            return false;
        }
    }

    private AccountPicker() {
    }

    @o0
    @Deprecated
    public static Intent newChooseAccountIntent(@q0 Account account, @q0 ArrayList<Account> arrayList, @q0 String[] strArr, boolean z5, @q0 String str, @q0 String str2, @q0 String[] strArr2, @q0 Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, ProtectedSandApp.s("ਚ"));
        intent.setAction(ProtectedSandApp.s("ਛ"));
        intent.setPackage(ProtectedSandApp.s("ਜ"));
        intent.putExtra(ProtectedSandApp.s("ਝ"), arrayList);
        intent.putExtra(ProtectedSandApp.s("ਞ"), strArr);
        intent.putExtra(ProtectedSandApp.s("ਟ"), bundle);
        intent.putExtra(ProtectedSandApp.s("ਠ"), account);
        intent.putExtra(ProtectedSandApp.s("ਡ"), z5);
        intent.putExtra(ProtectedSandApp.s("ਢ"), str);
        intent.putExtra(ProtectedSandApp.s("ਣ"), str2);
        intent.putExtra(ProtectedSandApp.s("ਤ"), strArr2);
        intent.putExtra(ProtectedSandApp.s("ਥ"), false);
        intent.putExtra(ProtectedSandApp.s("ਦ"), 0);
        intent.putExtra(ProtectedSandApp.s("ਧ"), 0);
        intent.putExtra(ProtectedSandApp.s("ਨ"), (String) null);
        return intent;
    }

    @o0
    public static Intent newChooseAccountIntent(@o0 AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zze(accountChooserOptions);
        Preconditions.checkArgument(true, ProtectedSandApp.s("\u0a29"));
        AccountChooserOptions.zzd(accountChooserOptions);
        Preconditions.checkArgument(true, ProtectedSandApp.s("ਪ"));
        AccountChooserOptions.zzB(accountChooserOptions);
        Preconditions.checkArgument(true, ProtectedSandApp.s("ਫ"));
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.setAction(ProtectedSandApp.s("ਬ"));
        intent.setPackage(ProtectedSandApp.s("ਭ"));
        intent.putExtra(ProtectedSandApp.s("ਮ"), accountChooserOptions.zzc);
        if (accountChooserOptions.zzd != null) {
            intent.putExtra(ProtectedSandApp.s("ਯ"), (String[]) accountChooserOptions.zzd.toArray(new String[0]));
        }
        intent.putExtra(ProtectedSandApp.s("ਰ"), accountChooserOptions.zzg);
        intent.putExtra(ProtectedSandApp.s("\u0a31"), accountChooserOptions.zza);
        AccountChooserOptions.zzB(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("ਲ"), false);
        intent.putExtra(ProtectedSandApp.s("ਲ਼"), accountChooserOptions.zze);
        intent.putExtra(ProtectedSandApp.s("\u0a34"), accountChooserOptions.zzf);
        AccountChooserOptions.zzC(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("ਵ"), false);
        AccountChooserOptions.zzf(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("ਸ਼"), (String) null);
        AccountChooserOptions.zza(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("\u0a37"), 0);
        AccountChooserOptions.zzD(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("ਸ"), 0);
        AccountChooserOptions.zze(accountChooserOptions);
        intent.putExtra(ProtectedSandApp.s("ਹ"), (String) null);
        Bundle bundle = new Bundle();
        AccountChooserOptions.zzD(accountChooserOptions);
        AccountChooserOptions.zzd(accountChooserOptions);
        AccountChooserOptions.zzz(accountChooserOptions);
        AccountChooserOptions.zzA(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra(ProtectedSandApp.s("\u0a3a"), bundle);
        }
        return intent;
    }
}
