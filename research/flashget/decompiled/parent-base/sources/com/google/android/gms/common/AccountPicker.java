package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class AccountPicker {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class AccountChooserOptions {

        @q0
        private Account zza;

        @q0
        private ArrayList zzb;

        @q0
        private ArrayList zzc;
        private boolean zzd;

        @q0
        private String zze;

        @q0
        private Bundle zzf;

        /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
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
                Preconditions.checkArgument(true, ProtectedSandApp.s("줏"));
                Preconditions.checkArgument(true, ProtectedSandApp.s("줐"));
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.zzf(this.zzc);
                accountChooserOptions.zzd(this.zzb);
                accountChooserOptions.zzh(this.zzd);
                accountChooserOptions.zzl(this.zzf);
                accountChooserOptions.zzb(this.zza);
                accountChooserOptions.zzj(this.zze);
                return accountChooserOptions;
            }

            @o0
            public Builder setAllowableAccounts(@q0 List<Account> list) {
                this.zzb = list == null ? null : new ArrayList(list);
                return this;
            }

            @o0
            public Builder setAllowableAccountsTypes(@q0 List<String> list) {
                this.zzc = list == null ? null : new ArrayList(list);
                return this;
            }

            @o0
            public Builder setAlwaysShowAccountPicker(boolean z4) {
                this.zzd = z4;
                return this;
            }

            @o0
            public Builder setOptionsForAddingAccount(@q0 Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            @o0
            public Builder setSelectedAccount(@q0 Account account) {
                this.zza = account;
                return this;
            }

            @o0
            public Builder setTitleOverrideText(@q0 String str) {
                this.zze = str;
                return this;
            }
        }

        final /* synthetic */ Account zza() {
            return this.zza;
        }

        final /* synthetic */ void zzb(Account account) {
            this.zza = account;
        }

        final /* synthetic */ ArrayList zzc() {
            return this.zzb;
        }

        final /* synthetic */ void zzd(ArrayList arrayList) {
            this.zzb = arrayList;
        }

        final /* synthetic */ ArrayList zze() {
            return this.zzc;
        }

        final /* synthetic */ void zzf(ArrayList arrayList) {
            this.zzc = arrayList;
        }

        final /* synthetic */ boolean zzg() {
            return this.zzd;
        }

        final /* synthetic */ void zzh(boolean z4) {
            this.zzd = z4;
        }

        final /* synthetic */ String zzi() {
            return this.zze;
        }

        final /* synthetic */ void zzj(String str) {
            this.zze = str;
        }

        final /* synthetic */ Bundle zzk() {
            return this.zzf;
        }

        final /* synthetic */ void zzl(Bundle bundle) {
            this.zzf = bundle;
        }
    }

    private AccountPicker() {
    }

    @o0
    @Deprecated
    public static Intent newChooseAccountIntent(@q0 Account account, @q0 ArrayList<Account> arrayList, @q0 String[] strArr, boolean z4, @q0 String str, @q0 String str2, @q0 String[] strArr2, @q0 Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, ProtectedSandApp.s("중"));
        intent.setAction(ProtectedSandApp.s("줒"));
        intent.setPackage(ProtectedSandApp.s("줓"));
        intent.putExtra(ProtectedSandApp.s("줔"), arrayList);
        intent.putExtra(ProtectedSandApp.s("줕"), strArr);
        intent.putExtra(ProtectedSandApp.s("줖"), bundle);
        intent.putExtra(ProtectedSandApp.s("줗"), account);
        intent.putExtra(ProtectedSandApp.s("줘"), z4);
        intent.putExtra(ProtectedSandApp.s("줙"), str);
        intent.putExtra(ProtectedSandApp.s("줚"), str2);
        intent.putExtra(ProtectedSandApp.s("줛"), strArr2);
        intent.putExtra(ProtectedSandApp.s("줜"), false);
        intent.putExtra(ProtectedSandApp.s("줝"), 0);
        intent.putExtra(ProtectedSandApp.s("줞"), 0);
        intent.putExtra(ProtectedSandApp.s("줟"), (String) null);
        return intent;
    }

    @o0
    public static Intent newChooseAccountIntent(@o0 AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        Preconditions.checkArgument(true, ProtectedSandApp.s("중"));
        Preconditions.checkArgument(true, ProtectedSandApp.s("줠"));
        Preconditions.checkArgument(true, ProtectedSandApp.s("줡"));
        intent.setAction(ProtectedSandApp.s("줒"));
        intent.setPackage(ProtectedSandApp.s("줓"));
        intent.putExtra(ProtectedSandApp.s("줔"), accountChooserOptions.zzc());
        if (accountChooserOptions.zze() != null) {
            intent.putExtra(ProtectedSandApp.s("줕"), (String[]) accountChooserOptions.zze().toArray(new String[0]));
        }
        intent.putExtra(ProtectedSandApp.s("줖"), accountChooserOptions.zzk());
        intent.putExtra(ProtectedSandApp.s("줗"), accountChooserOptions.zza());
        intent.putExtra(ProtectedSandApp.s("줢"), false);
        intent.putExtra(ProtectedSandApp.s("줘"), accountChooserOptions.zzg());
        intent.putExtra(ProtectedSandApp.s("줙"), accountChooserOptions.zzi());
        intent.putExtra(ProtectedSandApp.s("줜"), false);
        intent.putExtra(ProtectedSandApp.s("줣"), (String) null);
        intent.putExtra(ProtectedSandApp.s("줝"), 0);
        intent.putExtra(ProtectedSandApp.s("줞"), 0);
        intent.putExtra(ProtectedSandApp.s("줟"), (String) null);
        Bundle bundle = new Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra(ProtectedSandApp.s("줤"), bundle);
        }
        return intent;
    }
}
