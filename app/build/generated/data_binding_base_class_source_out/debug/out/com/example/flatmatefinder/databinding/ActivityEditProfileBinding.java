// Generated by view binder compiler. Do not edit!
package com.example.flatmatefinder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flatmatefinder.R;
import com.google.android.material.slider.Slider;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditProfileBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView YearHead;

  @NonNull
  public final TextView addInfo;

  @NonNull
  public final TextView addressHeading;

  @NonNull
  public final TextView area;

  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView branchHead;

  @NonNull
  public final Spinner branchSpinner;

  @NonNull
  public final TextView brokerageAmount;

  @NonNull
  public final TextView capacity;

  @NonNull
  public final TextView capacityDescription;

  @NonNull
  public final ImageView editProfile;

  @NonNull
  public final ConstraintLayout flatInfoLayout;

  @NonNull
  public final AppCompatButton flatNo;

  @NonNull
  public final TextView flatNumber;

  @NonNull
  public final AppCompatButton flatYes;

  @NonNull
  public final RadioButton fullyFurnished;

  @NonNull
  public final TextView heading;

  @NonNull
  public final TextView heading2;

  @NonNull
  public final TextView heading3;

  @NonNull
  public final ImageView image1;

  @NonNull
  public final ImageView image2;

  @NonNull
  public final ImageView image3;

  @NonNull
  public final ImageView image4;

  @NonNull
  public final EditText inputAddInfo;

  @NonNull
  public final EditText inputArea;

  @NonNull
  public final EditText inputBrokerageAmount;

  @NonNull
  public final EditText inputCapacity;

  @NonNull
  public final EditText inputFlatNo;

  @NonNull
  public final EditText inputMonthlyAmount;

  @NonNull
  public final TextView min;

  @NonNull
  public final TextView monthlyAmount;

  @NonNull
  public final EditText name;

  @NonNull
  public final TextView nameHeading;

  @NonNull
  public final RadioButton nonFurnished;

  @NonNull
  public final TextView occupied;

  @NonNull
  public final TextView occupiedDescription;

  @NonNull
  public final Slider occupiedSlider;

  @NonNull
  public final TextView photoDescription;

  @NonNull
  public final LinearLayout photoInputLayout;

  @NonNull
  public final ImageView profilePic;

  @NonNull
  public final RadioGroup radioInfo;

  @NonNull
  public final TextView rentHeading;

  @NonNull
  public final RadioButton semiFurnished;

  @NonNull
  public final TextView year;

  @NonNull
  public final Spinner yearSpinner;

  private ActivityEditProfileBinding(@NonNull ScrollView rootView, @NonNull TextView YearHead,
      @NonNull TextView addInfo, @NonNull TextView addressHeading, @NonNull TextView area,
      @NonNull ImageView back, @NonNull TextView branchHead, @NonNull Spinner branchSpinner,
      @NonNull TextView brokerageAmount, @NonNull TextView capacity,
      @NonNull TextView capacityDescription, @NonNull ImageView editProfile,
      @NonNull ConstraintLayout flatInfoLayout, @NonNull AppCompatButton flatNo,
      @NonNull TextView flatNumber, @NonNull AppCompatButton flatYes,
      @NonNull RadioButton fullyFurnished, @NonNull TextView heading, @NonNull TextView heading2,
      @NonNull TextView heading3, @NonNull ImageView image1, @NonNull ImageView image2,
      @NonNull ImageView image3, @NonNull ImageView image4, @NonNull EditText inputAddInfo,
      @NonNull EditText inputArea, @NonNull EditText inputBrokerageAmount,
      @NonNull EditText inputCapacity, @NonNull EditText inputFlatNo,
      @NonNull EditText inputMonthlyAmount, @NonNull TextView min, @NonNull TextView monthlyAmount,
      @NonNull EditText name, @NonNull TextView nameHeading, @NonNull RadioButton nonFurnished,
      @NonNull TextView occupied, @NonNull TextView occupiedDescription,
      @NonNull Slider occupiedSlider, @NonNull TextView photoDescription,
      @NonNull LinearLayout photoInputLayout, @NonNull ImageView profilePic,
      @NonNull RadioGroup radioInfo, @NonNull TextView rentHeading,
      @NonNull RadioButton semiFurnished, @NonNull TextView year, @NonNull Spinner yearSpinner) {
    this.rootView = rootView;
    this.YearHead = YearHead;
    this.addInfo = addInfo;
    this.addressHeading = addressHeading;
    this.area = area;
    this.back = back;
    this.branchHead = branchHead;
    this.branchSpinner = branchSpinner;
    this.brokerageAmount = brokerageAmount;
    this.capacity = capacity;
    this.capacityDescription = capacityDescription;
    this.editProfile = editProfile;
    this.flatInfoLayout = flatInfoLayout;
    this.flatNo = flatNo;
    this.flatNumber = flatNumber;
    this.flatYes = flatYes;
    this.fullyFurnished = fullyFurnished;
    this.heading = heading;
    this.heading2 = heading2;
    this.heading3 = heading3;
    this.image1 = image1;
    this.image2 = image2;
    this.image3 = image3;
    this.image4 = image4;
    this.inputAddInfo = inputAddInfo;
    this.inputArea = inputArea;
    this.inputBrokerageAmount = inputBrokerageAmount;
    this.inputCapacity = inputCapacity;
    this.inputFlatNo = inputFlatNo;
    this.inputMonthlyAmount = inputMonthlyAmount;
    this.min = min;
    this.monthlyAmount = monthlyAmount;
    this.name = name;
    this.nameHeading = nameHeading;
    this.nonFurnished = nonFurnished;
    this.occupied = occupied;
    this.occupiedDescription = occupiedDescription;
    this.occupiedSlider = occupiedSlider;
    this.photoDescription = photoDescription;
    this.photoInputLayout = photoInputLayout;
    this.profilePic = profilePic;
    this.radioInfo = radioInfo;
    this.rentHeading = rentHeading;
    this.semiFurnished = semiFurnished;
    this.year = year;
    this.yearSpinner = yearSpinner;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.YearHead;
      TextView YearHead = ViewBindings.findChildViewById(rootView, id);
      if (YearHead == null) {
        break missingId;
      }

      id = R.id.addInfo;
      TextView addInfo = ViewBindings.findChildViewById(rootView, id);
      if (addInfo == null) {
        break missingId;
      }

      id = R.id.addressHeading;
      TextView addressHeading = ViewBindings.findChildViewById(rootView, id);
      if (addressHeading == null) {
        break missingId;
      }

      id = R.id.area;
      TextView area = ViewBindings.findChildViewById(rootView, id);
      if (area == null) {
        break missingId;
      }

      id = R.id.back;
      ImageView back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.branchHead;
      TextView branchHead = ViewBindings.findChildViewById(rootView, id);
      if (branchHead == null) {
        break missingId;
      }

      id = R.id.branchSpinner;
      Spinner branchSpinner = ViewBindings.findChildViewById(rootView, id);
      if (branchSpinner == null) {
        break missingId;
      }

      id = R.id.brokerageAmount;
      TextView brokerageAmount = ViewBindings.findChildViewById(rootView, id);
      if (brokerageAmount == null) {
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

      id = R.id.editProfile;
      ImageView editProfile = ViewBindings.findChildViewById(rootView, id);
      if (editProfile == null) {
        break missingId;
      }

      id = R.id.flatInfoLayout;
      ConstraintLayout flatInfoLayout = ViewBindings.findChildViewById(rootView, id);
      if (flatInfoLayout == null) {
        break missingId;
      }

      id = R.id.flat_no;
      AppCompatButton flatNo = ViewBindings.findChildViewById(rootView, id);
      if (flatNo == null) {
        break missingId;
      }

      id = R.id.flat_number;
      TextView flatNumber = ViewBindings.findChildViewById(rootView, id);
      if (flatNumber == null) {
        break missingId;
      }

      id = R.id.flat_yes;
      AppCompatButton flatYes = ViewBindings.findChildViewById(rootView, id);
      if (flatYes == null) {
        break missingId;
      }

      id = R.id.fullyFurnished;
      RadioButton fullyFurnished = ViewBindings.findChildViewById(rootView, id);
      if (fullyFurnished == null) {
        break missingId;
      }

      id = R.id.heading;
      TextView heading = ViewBindings.findChildViewById(rootView, id);
      if (heading == null) {
        break missingId;
      }

      id = R.id.heading2;
      TextView heading2 = ViewBindings.findChildViewById(rootView, id);
      if (heading2 == null) {
        break missingId;
      }

      id = R.id.heading3;
      TextView heading3 = ViewBindings.findChildViewById(rootView, id);
      if (heading3 == null) {
        break missingId;
      }

      id = R.id.image_1;
      ImageView image1 = ViewBindings.findChildViewById(rootView, id);
      if (image1 == null) {
        break missingId;
      }

      id = R.id.image_2;
      ImageView image2 = ViewBindings.findChildViewById(rootView, id);
      if (image2 == null) {
        break missingId;
      }

      id = R.id.image_3;
      ImageView image3 = ViewBindings.findChildViewById(rootView, id);
      if (image3 == null) {
        break missingId;
      }

      id = R.id.image_4;
      ImageView image4 = ViewBindings.findChildViewById(rootView, id);
      if (image4 == null) {
        break missingId;
      }

      id = R.id.input_addInfo;
      EditText inputAddInfo = ViewBindings.findChildViewById(rootView, id);
      if (inputAddInfo == null) {
        break missingId;
      }

      id = R.id.input_area;
      EditText inputArea = ViewBindings.findChildViewById(rootView, id);
      if (inputArea == null) {
        break missingId;
      }

      id = R.id.input_brokerageAmount;
      EditText inputBrokerageAmount = ViewBindings.findChildViewById(rootView, id);
      if (inputBrokerageAmount == null) {
        break missingId;
      }

      id = R.id.input_capacity;
      EditText inputCapacity = ViewBindings.findChildViewById(rootView, id);
      if (inputCapacity == null) {
        break missingId;
      }

      id = R.id.input_flat_no;
      EditText inputFlatNo = ViewBindings.findChildViewById(rootView, id);
      if (inputFlatNo == null) {
        break missingId;
      }

      id = R.id.input_monthlyAmount;
      EditText inputMonthlyAmount = ViewBindings.findChildViewById(rootView, id);
      if (inputMonthlyAmount == null) {
        break missingId;
      }

      id = R.id.min;
      TextView min = ViewBindings.findChildViewById(rootView, id);
      if (min == null) {
        break missingId;
      }

      id = R.id.monthlyAmount;
      TextView monthlyAmount = ViewBindings.findChildViewById(rootView, id);
      if (monthlyAmount == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nameHeading;
      TextView nameHeading = ViewBindings.findChildViewById(rootView, id);
      if (nameHeading == null) {
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

      id = R.id.photoDescription;
      TextView photoDescription = ViewBindings.findChildViewById(rootView, id);
      if (photoDescription == null) {
        break missingId;
      }

      id = R.id.photoInputLayout;
      LinearLayout photoInputLayout = ViewBindings.findChildViewById(rootView, id);
      if (photoInputLayout == null) {
        break missingId;
      }

      id = R.id.profilePic;
      ImageView profilePic = ViewBindings.findChildViewById(rootView, id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.radioInfo;
      RadioGroup radioInfo = ViewBindings.findChildViewById(rootView, id);
      if (radioInfo == null) {
        break missingId;
      }

      id = R.id.rentHeading;
      TextView rentHeading = ViewBindings.findChildViewById(rootView, id);
      if (rentHeading == null) {
        break missingId;
      }

      id = R.id.semiFurnished;
      RadioButton semiFurnished = ViewBindings.findChildViewById(rootView, id);
      if (semiFurnished == null) {
        break missingId;
      }

      id = R.id.year;
      TextView year = ViewBindings.findChildViewById(rootView, id);
      if (year == null) {
        break missingId;
      }

      id = R.id.yearSpinner;
      Spinner yearSpinner = ViewBindings.findChildViewById(rootView, id);
      if (yearSpinner == null) {
        break missingId;
      }

      return new ActivityEditProfileBinding((ScrollView) rootView, YearHead, addInfo,
          addressHeading, area, back, branchHead, branchSpinner, brokerageAmount, capacity,
          capacityDescription, editProfile, flatInfoLayout, flatNo, flatNumber, flatYes,
          fullyFurnished, heading, heading2, heading3, image1, image2, image3, image4, inputAddInfo,
          inputArea, inputBrokerageAmount, inputCapacity, inputFlatNo, inputMonthlyAmount, min,
          monthlyAmount, name, nameHeading, nonFurnished, occupied, occupiedDescription,
          occupiedSlider, photoDescription, photoInputLayout, profilePic, radioInfo, rentHeading,
          semiFurnished, year, yearSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
