// Generated by view binder compiler. Do not edit!
package com.example.latihan_day_10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.latihan_day_10.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Halaman6Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView backgroundImage;

  @NonNull
  public final Button continueButton;

  private Halaman6Binding(@NonNull ScrollView rootView, @NonNull ImageView backgroundImage,
      @NonNull Button continueButton) {
    this.rootView = rootView;
    this.backgroundImage = backgroundImage;
    this.continueButton = continueButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static Halaman6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Halaman6Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.halaman6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Halaman6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backgroundImage;
      ImageView backgroundImage = ViewBindings.findChildViewById(rootView, id);
      if (backgroundImage == null) {
        break missingId;
      }

      id = R.id.continueButton;
      Button continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      return new Halaman6Binding((ScrollView) rootView, backgroundImage, continueButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
