package com.example.flatmatefinder.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\u0013H\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\t\u0010;\u001a\u00020\u0001H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u00a5\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u00c6\u0001J\u0013\u0010>\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\bH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001e\u00a8\u0006B"}, d2 = {"Lcom/example/flatmatefinder/models/FlatInfo;", "", "_id", "", "address", "Lcom/example/flatmatefinder/models/Address;", "branch", "capacity", "", "drink", "", "email", "flatImages", "", "googlePicture", "name", "nonVegetarian", "occupied", "profileImage", "Lcom/example/flatmatefinder/models/ProfileImage;", "smoke", "workout", "year", "(Ljava/lang/String;Lcom/example/flatmatefinder/models/Address;Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;ZILcom/example/flatmatefinder/models/ProfileImage;ZZI)V", "get_id", "()Ljava/lang/String;", "getAddress", "()Lcom/example/flatmatefinder/models/Address;", "getBranch", "getCapacity", "()I", "getDrink", "()Z", "getEmail", "getFlatImages", "()Ljava/util/List;", "getGooglePicture", "()Ljava/lang/Object;", "getName", "getNonVegetarian", "getOccupied", "getProfileImage", "()Lcom/example/flatmatefinder/models/ProfileImage;", "getSmoke", "getWorkout", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class FlatInfo {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.models.Address address = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String branch = null;
    private final int capacity = 0;
    private final boolean drink = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> flatImages = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object googlePicture = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    private final boolean nonVegetarian = false;
    private final int occupied = 0;
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.models.ProfileImage profileImage = null;
    private final boolean smoke = false;
    private final boolean workout = false;
    private final int year = 0;
    
    public FlatInfo(@org.jetbrains.annotations.NotNull
    java.lang.String _id, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String branch, int capacity, boolean drink, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> flatImages, @org.jetbrains.annotations.NotNull
    java.lang.Object googlePicture, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean nonVegetarian, int occupied, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.ProfileImage profileImage, boolean smoke, boolean workout, int year) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBranch() {
        return null;
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    public final boolean getDrink() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getFlatImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getGooglePicture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getNonVegetarian() {
        return false;
    }
    
    public final int getOccupied() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.ProfileImage getProfileImage() {
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
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.ProfileImage component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.Address component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.models.FlatInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String _id, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Address address, @org.jetbrains.annotations.NotNull
    java.lang.String branch, int capacity, boolean drink, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> flatImages, @org.jetbrains.annotations.NotNull
    java.lang.Object googlePicture, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean nonVegetarian, int occupied, @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.ProfileImage profileImage, boolean smoke, boolean workout, int year) {
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