package com.example.flatmatefinder.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0019J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u0006H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\u0001H\u00c6\u0003J\t\u00107\u001a\u00020\u0015H\u00c6\u0003J\t\u00108\u001a\u00020\fH\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0001H\u00c6\u0003J\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\t\u0010=\u001a\u00020\bH\u00c6\u0003J\t\u0010>\u001a\u00020\nH\u00c6\u0003J\t\u0010?\u001a\u00020\fH\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\u00b3\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\bH\u00c6\u0001J\u0013\u0010D\u001a\u00020\f2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\bH\u00d6\u0001J\t\u0010G\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0018\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!\u00a8\u0006H"}, d2 = {"Lcom/example/flatmatefinder/models/UserDetailsResponse;", "", "address", "Lcom/example/flatmatefinder/models/Address;", "bio", "branch", "", "capacity", "", "dob", "Lcom/example/flatmatefinder/models/Dob;", "drink", "", "email", "furnishingStatus", "gender", "hasFlat", "name", "occupied", "picture", "rent", "Lcom/example/flatmatefinder/models/Rent;", "smoke", "workout", "year", "(Lcom/example/flatmatefinder/models/Address;Ljava/lang/Object;Ljava/lang/String;ILcom/example/flatmatefinder/models/Dob;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Lcom/example/flatmatefinder/models/Rent;ZZI)V", "getAddress", "()Lcom/example/flatmatefinder/models/Address;", "getBio", "()Ljava/lang/Object;", "getBranch", "()Ljava/lang/String;", "getCapacity", "()I", "getDob", "()Lcom/example/flatmatefinder/models/Dob;", "getDrink", "()Z", "getEmail", "getFurnishingStatus", "getGender", "getHasFlat", "getName", "getOccupied", "getPicture", "getRent", "()Lcom/example/flatmatefinder/models/Rent;", "getSmoke", "getWorkout", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class UserDetailsResponse {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.models.Address address = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object bio = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String branch = null;
    private final int capacity = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.models.Dob dob = null;
    private final boolean drink = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String furnishingStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender = null;
    private final boolean hasFlat = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final int occupied = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object picture = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.models.Rent rent = null;
    private final boolean smoke = false;
    private final boolean workout = false;
    private final int year = 0;
    
    public UserDetailsResponse(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Address address, @org.jetbrains.annotations.NotNull
    java.lang.Object bio, @org.jetbrains.annotations.NotNull
    java.lang.String branch, int capacity, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Dob dob, boolean drink, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String furnishingStatus, @org.jetbrains.annotations.NotNull
    java.lang.String gender, boolean hasFlat, @org.jetbrains.annotations.NotNull
    java.lang.String name, int occupied, @org.jetbrains.annotations.NotNull
    java.lang.Object picture, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Rent rent, boolean smoke, boolean workout, int year) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBranch() {
        return null;
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Dob getDob() {
        return null;
    }
    
    public final boolean getDrink() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFurnishingStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
    
    public final boolean getHasFlat() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getOccupied() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Rent getRent() {
        return null;
    }
    
    public final boolean getSmoke() {
        return false;
    }
    
    public final boolean getWorkout() {
        return false;
    }
    
    public final int getYear() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Address component1() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Rent component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Dob component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.UserDetailsResponse copy(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Address address, @org.jetbrains.annotations.NotNull
    java.lang.Object bio, @org.jetbrains.annotations.NotNull
    java.lang.String branch, int capacity, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Dob dob, boolean drink, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String furnishingStatus, @org.jetbrains.annotations.NotNull
    java.lang.String gender, boolean hasFlat, @org.jetbrains.annotations.NotNull
    java.lang.String name, int occupied, @org.jetbrains.annotations.NotNull
    java.lang.Object picture, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Rent rent, boolean smoke, boolean workout, int year) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}