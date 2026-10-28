package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.d;
import androidx.core.graphics.e;
import androidx.fragment.app.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.UCropFragment;
import com.yalantis.ucrop.UCropGalleryAdapter;
import com.yalantis.ucrop.decoration.GridSpacingItemDecoration;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.statusbar.ImmersiveManager;
import com.yalantis.ucrop.util.DensityUtil;
import com.yalantis.ucrop.util.FileUtils;
import e.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class UCropMultipleActivity extends AppCompatActivity implements UCropFragmentCallback {
    private ArrayList<AspectRatio> aspectRatioList;
    private int currentFragmentPosition;
    private UCropGalleryAdapter galleryAdapter;
    private boolean isForbidCropGifWebp;
    private boolean isSkipCropForbid;
    private boolean mShowLoader;
    private int mStatusBarColor;

    @v
    private int mToolbarCancelDrawable;
    private int mToolbarColor;

    @v
    private int mToolbarCropDrawable;
    private String mToolbarTitle;
    private int mToolbarTitleSize;
    private int mToolbarWidgetColor;
    private String outputCropFileName;
    private UCropFragment uCropCurrentFragment;
    private ArrayList<String> uCropNotSupportList;
    private ArrayList<String> uCropSupportList;
    private final List<UCropFragment> fragments = new ArrayList();
    private final LinkedHashMap<String, JSONObject> uCropTotalQueue = new LinkedHashMap<>();
    private final HashSet<String> filterSet = new HashSet<>();

    static {
        g.Y(true);
    }

    private int getCropSupportPosition() {
        ArrayList<String> stringArrayList;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (stringArrayList = extras.getStringArrayList(ProtectedSandApp.s("庼\u0001"))) == null || stringArrayList.size() <= 0) {
            return 0;
        }
        this.filterSet.addAll(stringArrayList);
        int i4 = -1;
        for (int i5 = 0; i5 < this.uCropSupportList.size(); i5++) {
            i4++;
            if (!this.filterSet.contains(getPathToMimeType(this.uCropSupportList.get(i5)))) {
                break;
            }
        }
        if (i4 == -1 || i4 > this.fragments.size()) {
            return 0;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPathToMimeType(String str) {
        return FileUtils.isContent(str) ? FileUtils.getMimeTypeFromMediaContentUri(this, Uri.parse(str)) : FileUtils.getMimeTypeFromMediaContentUri(this, Uri.fromFile(new File(str)));
    }

    private String getSandboxPathDir() {
        String stringExtra = getIntent().getStringExtra(ProtectedSandApp.s("庽\u0001"));
        File file = (stringExtra == null || "".equals(stringExtra)) ? new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), ProtectedSandApp.s("庾\u0001")) : new File(stringExtra);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath() + File.separator;
    }

    private void handleCropError(@o0 Intent intent) {
        Throwable error = UCrop.getError(intent);
        if (error != null) {
            Toast.makeText(this, error.getMessage(), 1).show();
        } else {
            Toast.makeText(this, ProtectedSandApp.s("庿\u0001"), 0).show();
        }
    }

    private void immersive() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(ProtectedSandApp.s("廀\u0001"), false);
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("廁\u0001"), d.getColor(this, R.color.ucrop_color_statusbar));
        this.mStatusBarColor = intExtra;
        ImmersiveManager.immersiveAboveAPI23(this, intExtra, intExtra, booleanExtra);
    }

    private void initCropFragments(Intent intent) {
        String str;
        int i4 = 0;
        this.isSkipCropForbid = intent.getBooleanExtra(ProtectedSandApp.s("廂\u0001"), false);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(ProtectedSandApp.s("廃\u0001"));
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("廋\u0001"));
        }
        this.uCropSupportList = new ArrayList<>();
        this.uCropNotSupportList = new ArrayList<>();
        while (i4 < stringArrayListExtra.size()) {
            String str2 = stringArrayListExtra.get(i4);
            this.uCropTotalQueue.put(str2, new JSONObject());
            String path = FileUtils.isContent(str2) ? FileUtils.getPath(this, Uri.parse(str2)) : str2;
            String pathToMimeType = getPathToMimeType(str2);
            if (FileUtils.isUrlHasVideo(path) || FileUtils.isHasVideo(pathToMimeType) || FileUtils.isHasAudio(pathToMimeType)) {
                this.uCropNotSupportList.add(str2);
            } else {
                this.uCropSupportList.add(str2);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Uri parse = (FileUtils.isContent(str2) || FileUtils.isHasHttp(str2)) ? Uri.parse(str2) : Uri.fromFile(new File(str2));
                    String postfixDefaultJPEG = FileUtils.getPostfixDefaultJPEG(this, this.isForbidCropGifWebp, parse);
                    if (TextUtils.isEmpty(this.outputCropFileName)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(FileUtils.getCreateFileName(ProtectedSandApp.s("廄\u0001") + (i4 + 1)));
                        sb.append(postfixDefaultJPEG);
                        str = sb.toString();
                    } else {
                        str = (i4 + 1) + FileUtils.getCreateFileName() + ProtectedSandApp.s("廅\u0001") + this.outputCropFileName;
                    }
                    Uri fromFile = Uri.fromFile(new File(getSandboxPathDir(), str));
                    extras.putParcelable(ProtectedSandApp.s("廆\u0001"), parse);
                    extras.putParcelable(ProtectedSandApp.s("廇\u0001"), fromFile);
                    ArrayList<AspectRatio> arrayList = this.aspectRatioList;
                    AspectRatio aspectRatio = (arrayList == null || arrayList.size() <= i4) ? null : this.aspectRatioList.get(i4);
                    if (aspectRatio != null) {
                        extras.putFloat(ProtectedSandApp.s("廈\u0001"), aspectRatio.getAspectRatioX());
                        extras.putFloat(ProtectedSandApp.s("廉\u0001"), aspectRatio.getAspectRatioY());
                    }
                    this.fragments.add(UCropFragment.newInstance(extras));
                }
            }
            i4++;
        }
        if (this.uCropSupportList.size() == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("廊\u0001"));
        }
        setGalleryAdapter();
        switchCropFragment(this.fragments.get(getCropSupportPosition()), getCropSupportPosition());
        this.galleryAdapter.setCurrentSelectPosition(getCropSupportPosition());
    }

    private void mergeCropResult(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(ProtectedSandApp.s("廌\u0001"));
            JSONObject jSONObject = this.uCropTotalQueue.get(stringExtra);
            Uri output = UCrop.getOutput(intent);
            jSONObject.put(ProtectedSandApp.s("廍\u0001"), output != null ? output.getPath() : "");
            jSONObject.put(ProtectedSandApp.s("廎\u0001"), UCrop.getOutputImageWidth(intent));
            jSONObject.put(ProtectedSandApp.s("廏\u0001"), UCrop.getOutputImageHeight(intent));
            jSONObject.put(ProtectedSandApp.s("廐\u0001"), UCrop.getOutputImageOffsetX(intent));
            jSONObject.put(ProtectedSandApp.s("廑\u0001"), UCrop.getOutputImageOffsetY(intent));
            jSONObject.put(ProtectedSandApp.s("廒\u0001"), UCrop.getOutputCropAspectRatio(intent));
            this.uCropTotalQueue.put(stringExtra, jSONObject);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void onCropCompleteFinish() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Map.Entry<String, JSONObject>> it = this.uCropTotalQueue.entrySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getValue());
        }
        Intent intent = new Intent();
        intent.putExtra(ProtectedSandApp.s("廓\u0001"), jSONArray.toString());
        setResult(-1, intent);
        finish();
    }

    private void setGalleryAdapter() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_gallery);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(Integer.MAX_VALUE, DensityUtil.dip2px(this, 6.0f), true));
        }
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(this, R.anim.ucrop_layout_animation_fall_down));
        recyclerView.setBackgroundResource(getIntent().getIntExtra(ProtectedSandApp.s("廔\u0001"), R.drawable.ucrop_gallery_bg));
        UCropGalleryAdapter uCropGalleryAdapter = new UCropGalleryAdapter(this.uCropSupportList);
        this.galleryAdapter = uCropGalleryAdapter;
        uCropGalleryAdapter.setOnItemClickListener(new UCropGalleryAdapter.OnItemClickListener() { // from class: com.yalantis.ucrop.UCropMultipleActivity.1
            @Override // com.yalantis.ucrop.UCropGalleryAdapter.OnItemClickListener
            public void onItemClick(int i4, View view) {
                if (UCropMultipleActivity.this.isSkipCropForbid) {
                    return;
                }
                if (UCropMultipleActivity.this.filterSet.contains(UCropMultipleActivity.this.getPathToMimeType((String) UCropMultipleActivity.this.uCropSupportList.get(i4)))) {
                    Toast.makeText(UCropMultipleActivity.this.getApplicationContext(), UCropMultipleActivity.this.getString(R.string.ucrop_not_crop), 0).show();
                    return;
                }
                if (UCropMultipleActivity.this.galleryAdapter.getCurrentSelectPosition() == i4) {
                    return;
                }
                UCropMultipleActivity.this.galleryAdapter.notifyItemChanged(UCropMultipleActivity.this.galleryAdapter.getCurrentSelectPosition());
                UCropMultipleActivity.this.galleryAdapter.setCurrentSelectPosition(i4);
                UCropMultipleActivity.this.galleryAdapter.notifyItemChanged(i4);
                UCropMultipleActivity.this.switchCropFragment((UCropFragment) UCropMultipleActivity.this.fragments.get(i4), i4);
            }
        });
        recyclerView.setAdapter(this.galleryAdapter);
    }

    @TargetApi(21)
    private void setStatusBarColor(@l int i4) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i4);
        }
    }

    private void setupAppBar() {
        setStatusBarColor(this.mStatusBarColor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.mToolbarColor);
        toolbar.d1(this.mToolbarWidgetColor);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.mToolbarWidgetColor);
        textView.setText(this.mToolbarTitle);
        textView.setTextSize(this.mToolbarTitleSize);
        Drawable mutate = a.b(this, this.mToolbarCancelDrawable).mutate();
        mutate.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
        toolbar.L0(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.d0(false);
        }
    }

    private void setupViews(@o0 Intent intent) {
        this.aspectRatioList = getIntent().getParcelableArrayListExtra(ProtectedSandApp.s("廕\u0001"));
        this.isForbidCropGifWebp = intent.getBooleanExtra(ProtectedSandApp.s("廖\u0001"), false);
        this.outputCropFileName = intent.getStringExtra(ProtectedSandApp.s("廗\u0001"));
        this.mStatusBarColor = intent.getIntExtra(ProtectedSandApp.s("廁\u0001"), d.getColor(this, R.color.ucrop_color_statusbar));
        this.mToolbarColor = intent.getIntExtra(ProtectedSandApp.s("廘\u0001"), d.getColor(this, R.color.ucrop_color_toolbar));
        this.mToolbarWidgetColor = intent.getIntExtra(ProtectedSandApp.s("廙\u0001"), d.getColor(this, R.color.ucrop_color_toolbar_widget));
        this.mToolbarCancelDrawable = intent.getIntExtra(ProtectedSandApp.s("廚\u0001"), R.drawable.ucrop_ic_cross);
        this.mToolbarCropDrawable = intent.getIntExtra(ProtectedSandApp.s("廛\u0001"), R.drawable.ucrop_ic_done);
        this.mToolbarTitle = intent.getStringExtra(ProtectedSandApp.s("廜\u0001"));
        this.mToolbarTitleSize = intent.getIntExtra(ProtectedSandApp.s("廝\u0001"), 18);
        String str = this.mToolbarTitle;
        if (str == null) {
            str = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.mToolbarTitle = str;
        setupAppBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchCropFragment(UCropFragment uCropFragment, int i4) {
        l0 u4 = getSupportFragmentManager().u();
        if (uCropFragment.isAdded()) {
            u4.z(this.uCropCurrentFragment).U(uCropFragment);
            uCropFragment.fragmentReVisible();
        } else {
            UCropFragment uCropFragment2 = this.uCropCurrentFragment;
            if (uCropFragment2 != null) {
                u4.z(uCropFragment2);
            }
            u4.h(R.id.fragment_container, uCropFragment, UCropFragment.TAG + ProtectedSandApp.s("廞\u0001") + i4);
        }
        this.currentFragmentPosition = i4;
        this.uCropCurrentFragment = uCropFragment;
        u4.s();
    }

    @Override // com.yalantis.ucrop.UCropFragmentCallback
    public void loadingProgress(boolean z4) {
        this.mShowLoader = z4;
        supportInvalidateOptionsMenu();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        immersive();
        setContentView(R.layout.ucrop_activity_multiple);
        setupViews(getIntent());
        initCropFragments(getIntent());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R.id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
                findItem.setIcon(icon);
            } catch (IllegalStateException e4) {
                e4.printStackTrace();
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = d.getDrawable(this, this.mToolbarCropDrawable);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
        findItem2.setIcon(drawable);
        return true;
    }

    @Override // com.yalantis.ucrop.UCropFragmentCallback
    public void onCropFinish(UCropFragment.UCropResult uCropResult) {
        int i4 = uCropResult.mResultCode;
        if (i4 != -1) {
            if (i4 != 96) {
                return;
            }
            handleCropError(uCropResult.mResultData);
            return;
        }
        int size = this.uCropNotSupportList.size() + this.currentFragmentPosition;
        int size2 = (this.uCropSupportList.size() + this.uCropNotSupportList.size()) - 1;
        mergeCropResult(uCropResult.mResultData);
        if (size == size2) {
            onCropCompleteFinish();
            return;
        }
        int i5 = this.currentFragmentPosition + 1;
        String pathToMimeType = getPathToMimeType(this.uCropSupportList.get(i5));
        while (this.filterSet.contains(pathToMimeType)) {
            if (i5 == size2) {
                onCropCompleteFinish();
                return;
            } else {
                i5++;
                pathToMimeType = getPathToMimeType(this.uCropSupportList.get(i5));
            }
        }
        switchCropFragment(this.fragments.get(i5), i5);
        UCropGalleryAdapter uCropGalleryAdapter = this.galleryAdapter;
        uCropGalleryAdapter.notifyItemChanged(uCropGalleryAdapter.getCurrentSelectPosition());
        this.galleryAdapter.setCurrentSelectPosition(i5);
        UCropGalleryAdapter uCropGalleryAdapter2 = this.galleryAdapter;
        uCropGalleryAdapter2.notifyItemChanged(uCropGalleryAdapter2.getCurrentSelectPosition());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        UCropDevelopConfig.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_crop) {
            UCropFragment uCropFragment = this.uCropCurrentFragment;
            if (uCropFragment != null && uCropFragment.isAdded()) {
                this.uCropCurrentFragment.cropAndSaveImage();
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.mShowLoader);
        menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        return super.onPrepareOptionsMenu(menu);
    }
}
