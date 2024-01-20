// Generated by view binder compiler. Do not edit!
package com.example.flatmatefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flatmatefinder.R;
import com.google.android.material.slider.Slider;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFlatInfo2Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView addressHeading;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView capacity;

  @NonNull
  public final TextView capacityDescription;

  @NonNull
  public final RadioButton fullyFurnished;

  @NonNull
  public final EditText inputCapacity;

  @NonNull
  public final TextView min;

  @NonNull
  public final TextView nameHeading;

  @NonNull
  public final AppCompatButton next;

  @NonNull
  public final RadioButton nonFurnished;

  @NonNull
  public final TextView occupied;

  @NonNull
  public final TextView occupiedDescription;

  @NonNull
  public final Slider occupiedSlider;

  @NonNull
  public final AppCompatButton ok;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RadioGroup radioInfo;

  @NonNull
  public final RadioButton semiFurnished;

  private FragmentFlatInfo2Binding(@NonNull ScrollView rootView, @NonNull TextView addressHeading,
      @NonNull ImageView back, @NonNull TextView capacity, @NonNull TextView capacityDescription,
      @NonNull RadioButton fullyFurnished, @NonNull EditText inputCapacity, @NonNull TextView min,
      @NonNull TextView nameHeading, @NonNull AppCompatButton next,
      @NonNull RadioButton nonFurnished, @NonNull TextView occupied,
      @NonNull TextView occupiedDescription, @NonNull Slider occupiedSlider,
      @NonNull AppCompatButton ok, @NonNull ProgressBar progressBar, @NonNull RadioGroup radioInfo,
      @NonNull RadioButton semiFurnished) {
    this.rootView = rootView;
    this.addressHeading = addressHeading;
    this.back = back;
    this.capacity = capacity;
    this.capacityDescription = capacityDescription;
    this.fullyFurnished = fullyFurnished;
    this.inputCapacity = inputCapacity;
    this.min = min;
    this.nameHeading = nameHeading;
    this.next = next;
    this.nonFurnished = nonFurnished;
    this.occupied = occupied;
    this.occupiedDescription = occupiedDescription;
    this.occupiedSlider = occupiedSlider;
    this.ok = ok;
    this.progressBar = progressBar;
    this.radioInfo = radioInfo;
    this.semiFurnished = semiFurnished;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFlatInfo2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFlatInfo2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_flat_info2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFlatInfo2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressHeading;
      TextView addressHeading = ViewBindings.findChildViewById(rootView, id);
      if (addressHeading == null) {
        break missingId;
      }

      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.capacity;
      TextView capacity = ViewBindings.findChildViewById(rootView, id);
      if (capacity == null) {
        break missingId;
      }

      id = R.id.capacityDescription;
      TextView capacityDescription = ViewBindings.findChildViewById(rootView, id);
      if (capacityDescription == null) {
        break missingId;
      }

      id = R.id.fullyFurnished;
      RadioButton fullyFurnished = ViewBindings.findChildViewById(rootView, id);
      if (fullyFurnished == null) {
        break missingId;
      }

      id = R.id.input_capacity;
      EditText inputCapacity = ViewBindings.findChildViewById(rootView, id);
      if (inputCapacity == null) {
        break missingId;
      }

      id = R.id.min;
      TextView min = ViewBindings.findChildViewById(rootView, id);
      if (min == null) {
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

      id = R.id.nonFurnished;
      RadioButton nonFurnished = ViewBindings.findChildViewById(rootView, id);
      if (nonFurnished == null) {
        break missingId;
      }

      id = R.id.occupied;
      TextView occupied = ViewBindings.findChildViewById(rootView, id);
      if (occupied == null) {
        break missingId;
      }

      id = R.id.occupiedDescription;
      TextView occupiedDescription = ViewBindings.findChildViewById(rootView, id);
      if (occupiedDescription == null) {
        break missingId;
      }

      id = R.id.occupiedSlider;
      Slider occupiedSlider = ViewBindings.findChildViewById(rootView, id);
      if (occupiedSlider == null) {
        break missingId;
      }

      id = R.id.ok;
      AppCompatButton ok = ViewBindings.findChildViewById(rootView, id);
      if (ok == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.radioInfo;
      RadioGroup radioInfo = ViewBindings.findChildViewById(rootView, id);
      if (radioInfo == null) {
        break missingId;
      }

      id = R.id.semiFurnished;
      RadioButton semiFurnished = ViewBindings.findChildViewById(rootView, id);
      if (semiFurnished == null) {
        break missingId;
      }

      return new FragmentFlatInfo2Binding((ScrollView) rootView, addressHeading, back, capacity,
          capacityDescription, fullyFurnished, inputCapacity, min, nameHeading, next, nonFurnished,
          occupied, occupiedDescription, occupiedSlider, ok, progressBar, radioInfo, semiFurnished);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
