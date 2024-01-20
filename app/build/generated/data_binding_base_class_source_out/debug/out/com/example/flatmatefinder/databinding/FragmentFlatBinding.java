// Generated by view binder compiler. Do not edit!
package com.example.flatmatefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flatmatefinder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFlatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton NoButton;

  @NonNull
  public final AppCompatButton YesButton;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView nameHeading;

  @NonNull
  public final AppCompatButton next;

  @NonNull
  public final ProgressBar progressBar;

  private FragmentFlatBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton NoButton,
      @NonNull AppCompatButton YesButton, @NonNull ImageView back, @NonNull TextView nameHeading,
      @NonNull AppCompatButton next, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.NoButton = NoButton;
    this.YesButton = YesButton;
    this.back = back;
    this.nameHeading = nameHeading;
    this.next = next;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFlatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFlatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_flat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFlatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.NoButton;
      AppCompatButton NoButton = ViewBindings.findChildViewById(rootView, id);
      if (NoButton == null) {
        break missingId;
      }

      id = R.id.YesButton;
      AppCompatButton YesButton = ViewBindings.findChildViewById(rootView, id);
      if (YesButton == null) {
        break missingId;
      }

      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.nameHeading;
      TextView nameHeading = ViewBindings.findChildViewById(rootView, id);
      if (nameHeading == null) {
        break missingId;
      }

      id = R.id.next;
      AppCompatButton next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new FragmentFlatBinding((ConstraintLayout) rootView, NoButton, YesButton, back,
          nameHeading, next, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}