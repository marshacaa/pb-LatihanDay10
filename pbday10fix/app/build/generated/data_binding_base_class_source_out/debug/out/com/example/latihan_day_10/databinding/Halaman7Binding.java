// Generated by view binder compiler. Do not edit!
package com.example.latihan_day_10.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class Halaman7Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView backgroundImage2;

  private Halaman7Binding(@NonNull ScrollView rootView, @NonNull ImageView backgroundImage2) {
    this.rootView = rootView;
    this.backgroundImage2 = backgroundImage2;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static Halaman7Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Halaman7Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.halaman7, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Halaman7Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backgroundImage2;
      ImageView backgroundImage2 = ViewBindings.findChildViewById(rootView, id);
      if (backgroundImage2 == null) {
        break missingId;
      }

      return new Halaman7Binding((ScrollView) rootView, backgroundImage2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
