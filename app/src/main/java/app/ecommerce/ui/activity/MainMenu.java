package app.ecommerce.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.ecommerce.ui.R;
import app.ecommerce.ui.activity.category.CategoryBestSellers;
import app.ecommerce.ui.activity.category.CategoryBrandName;
import app.ecommerce.ui.activity.category.CategoryCardSimple;
import app.ecommerce.ui.activity.category.CategoryCardTwo;
import app.ecommerce.ui.activity.category.CategoryCatalog;
import app.ecommerce.ui.activity.category.CategoryClothes;
import app.ecommerce.ui.activity.category.CategoryFashionWoman;
import app.ecommerce.ui.activity.category.CategoryGridOption;
import app.ecommerce.ui.activity.category.CategorySliderCollection;
import app.ecommerce.ui.activity.category.CategoryStore;
import app.ecommerce.ui.activity.category.CategorySubFashion;
import app.ecommerce.ui.activity.category.CategoryTags;
import app.ecommerce.ui.activity.category.CategoryTopics;
import app.ecommerce.ui.activity.home.HomeBooks;
import app.ecommerce.ui.activity.home.HomeBooksDiscover;
import app.ecommerce.ui.activity.home.HomeDashboardLight;
import app.ecommerce.ui.activity.home.HomeFashion;
import app.ecommerce.ui.activity.home.HomeFashionFlat;
import app.ecommerce.ui.activity.home.HomeFood;
import app.ecommerce.ui.activity.home.HomeFurnite;
import app.ecommerce.ui.activity.home.HomeGadget;
import app.ecommerce.ui.activity.home.HomeGrid;
import app.ecommerce.ui.activity.home.HomeMedical;
import app.ecommerce.ui.activity.home.HomeNewArrivals;
import app.ecommerce.ui.activity.home.HomeNewsDeal;
import app.ecommerce.ui.activity.home.HomeNewsList;
import app.ecommerce.ui.activity.home.HomeRedSimple;
import app.ecommerce.ui.activity.home.HomeResto;
import app.ecommerce.ui.activity.home.HomeRound;
import app.ecommerce.ui.activity.home.HomeShoesStory;
import app.ecommerce.ui.activity.home.HomeSquareImage;
import app.ecommerce.ui.activity.home.HomeTopCircle;
import app.ecommerce.ui.activity.home.HomeWallet;
import app.ecommerce.ui.activity.home.HomeWalletPurple;
import app.ecommerce.ui.activity.home.HomeWishlist;
import app.ecommerce.ui.activity.other.OtherFaqFlat;
import app.ecommerce.ui.activity.other.OthersTicketCoupon;
import app.ecommerce.ui.activity.payment.PaymentAddCard;
import app.ecommerce.ui.activity.payment.PaymentDrawerBlue;
import app.ecommerce.ui.activity.payment.PaymentFinancialProfile;
import app.ecommerce.ui.activity.payment.PaymentFormBilling;
import app.ecommerce.ui.activity.payment.PaymentMobileTopup;
import app.ecommerce.ui.activity.payment.PaymentWalletLight;
import app.ecommerce.ui.activity.payment.PaymentWalletPay;
import app.ecommerce.ui.activity.process.ProcessAddressForm;
import app.ecommerce.ui.activity.process.ProcessAddressing;
import app.ecommerce.ui.activity.process.ProcessCardOrder;
import app.ecommerce.ui.activity.process.ProcessCartLight;
import app.ecommerce.ui.activity.process.ProcessCheckoutCard;
import app.ecommerce.ui.activity.process.ProcessCheckoutDetails;
import app.ecommerce.ui.activity.process.ProcessConfirmOrder;
import app.ecommerce.ui.activity.process.ProcessDelivForm;
import app.ecommerce.ui.activity.process.ProcessDelivery;
import app.ecommerce.ui.activity.process.ProcessDeliveryTrack;
import app.ecommerce.ui.activity.process.ProcessFoodOrder;
import app.ecommerce.ui.activity.process.ProcessHistory;
import app.ecommerce.ui.activity.process.ProcessInvoice;
import app.ecommerce.ui.activity.process.ProcessNotifActivity;
import app.ecommerce.ui.activity.process.ProcessNotifDark;
import app.ecommerce.ui.activity.process.ProcessOrderStatus;
import app.ecommerce.ui.activity.process.ProcessOrderSuccess;
import app.ecommerce.ui.activity.process.ProcessOrderTrack;
import app.ecommerce.ui.activity.process.ProcessOrderTrackList;
import app.ecommerce.ui.activity.process.ProcessPromoCode;
import app.ecommerce.ui.activity.process.ProcessRoundOrderStatus;
import app.ecommerce.ui.activity.process.ProcessShipOption;
import app.ecommerce.ui.activity.product.ProductDesk;
import app.ecommerce.ui.activity.product.ProductDetailsFashion;
import app.ecommerce.ui.activity.product.ProductDetailsReview;
import app.ecommerce.ui.activity.product.ProductDetailsRoom;
import app.ecommerce.ui.activity.product.ProductElectronic;
import app.ecommerce.ui.activity.product.ProductFashionDetails;
import app.ecommerce.ui.activity.product.ProductFood;
import app.ecommerce.ui.activity.product.ProductGridProperty;
import app.ecommerce.ui.activity.product.ProductListSimple;
import app.ecommerce.ui.activity.product.ProductNewForm;
import app.ecommerce.ui.activity.product.ProductPhone;
import app.ecommerce.ui.activity.product.ProductPhoneDetail;
import app.ecommerce.ui.activity.product.ProductRatingComment;
import app.ecommerce.ui.activity.product.ProductRoomFacilities;
import app.ecommerce.ui.activity.product.ProductScrollHorizontal;
import app.ecommerce.ui.activity.product.ProductSizeColor;
import app.ecommerce.ui.activity.product.ProductSneaker;
import app.ecommerce.ui.activity.product.ProductSofa;
import app.ecommerce.ui.activity.product.ProductVariant;
import app.ecommerce.ui.activity.product.ProductWishlistFashion;
import app.ecommerce.ui.activity.product.ProductWishlistWhite;
import app.ecommerce.ui.activity.product.ProductWriteReview;
import app.ecommerce.ui.activity.product.ProductsDetailsElegant;
import app.ecommerce.ui.activity.profile.ProfileAccount;
import app.ecommerce.ui.activity.profile.ProfileBigPhoto;
import app.ecommerce.ui.activity.profile.ProfileBlueCard;
import app.ecommerce.ui.activity.profile.ProfileBuyerFlat;
import app.ecommerce.ui.activity.profile.ProfileCardList;
import app.ecommerce.ui.activity.profile.ProfileCash;
import app.ecommerce.ui.activity.profile.ProfileEditData;
import app.ecommerce.ui.activity.profile.ProfileGirl;
import app.ecommerce.ui.activity.profile.ProfileMedical;
import app.ecommerce.ui.activity.profile.ProfileMenuSimple;
import app.ecommerce.ui.activity.profile.ProfileMenuStats;
import app.ecommerce.ui.activity.profile.ProfileOrderHistory;
import app.ecommerce.ui.activity.profile.ProfileOrderHistoryWhite;
import app.ecommerce.ui.activity.profile.ProfilePoints;
import app.ecommerce.ui.activity.profile.ProfileRed;
import app.ecommerce.ui.activity.profile.ProfileRoundMenu;
import app.ecommerce.ui.activity.profile.ProfileSeller;
import app.ecommerce.ui.activity.profile.ProfileSettings;
import app.ecommerce.ui.activity.profile.ProfileStore;
import app.ecommerce.ui.activity.profile.ProfileStoreRating;
import app.ecommerce.ui.activity.profile.ProfileSubMenu;
import app.ecommerce.ui.activity.profile.ProfileSubWhite;
import app.ecommerce.ui.activity.profile.ProfileWallet;
import app.ecommerce.ui.activity.promo.PromoCodeList;
import app.ecommerce.ui.activity.promo.PromoCouponApply;
import app.ecommerce.ui.activity.promo.PromoCouponCode;
import app.ecommerce.ui.activity.promo.PromoVoucherList;
import app.ecommerce.ui.activity.register.LoginBigImageFashion;
import app.ecommerce.ui.activity.register.LoginIntro;
import app.ecommerce.ui.activity.register.LoginJoin;
import app.ecommerce.ui.activity.register.LoginOtpVerification;
import app.ecommerce.ui.activity.register.LoginRoundBlue;
import app.ecommerce.ui.activity.register.LoginRoundSmooth;
import app.ecommerce.ui.activity.register.LoginStartWhite;
import app.ecommerce.ui.activity.register.RegisterBlueFlat;
import app.ecommerce.ui.activity.register.RegisterCreateForm;
import app.ecommerce.ui.activity.register.RegisterCreateLine;
import app.ecommerce.ui.activity.register.RegisterFoodImage;
import app.ecommerce.ui.activity.register.RegisterFormPaypal;
import app.ecommerce.ui.activity.register.RegisterRoundBlue;
import app.ecommerce.ui.activity.register.RegisterSignUp;
import app.ecommerce.ui.activity.register.RegisterStarted;
import app.ecommerce.ui.activity.search.SearchAddressOption;
import app.ecommerce.ui.activity.search.SearchExploreRed;
import app.ecommerce.ui.activity.search.SearchFashion;
import app.ecommerce.ui.activity.search.SearchFilterBottom;
import app.ecommerce.ui.activity.search.SearchFilterComplete;
import app.ecommerce.ui.activity.search.SearchFilterGrocery;
import app.ecommerce.ui.activity.search.SearchFilterPhone;
import app.ecommerce.ui.activity.search.SearchFilterWhite;
import app.ecommerce.ui.activity.search.SearchGoogle;
import app.ecommerce.ui.activity.search.SearchHotels;
import app.ecommerce.ui.activity.search.SearchHouse;
import app.ecommerce.ui.activity.search.SearchStoreFinder;
import app.ecommerce.ui.activity.search.SearchSuggestionBlue;
import app.ecommerce.ui.activity.search.SearchSuggestionLight;
import app.ecommerce.ui.adapter.AdapterMainMenu;
import app.ecommerce.ui.model.ItemMenu;
import app.ecommerce.ui.utils.Tools;

public class MainMenu extends AppCompatActivity {

    // name variable view lowercase underscore
    RecyclerView recycler_view;
    AdapterMainMenu adapter;
    List<ItemMenu> items = new ArrayList<>();
    private DrawerLayout drawer;
    private View notif_badge;
    private int notification_count = -1;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        initToolbar();
        initMenuItem();
        initComponent();
        initDrawerMenu();
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        //change menu button color
        Tools.changeNavigationIconColor(toolbar, getResources().getColor(R.color.grey_60));
        //change overflow menu button color
        Tools.changeOverflowMenuIconColor(toolbar, getResources().getColor(R.color.grey_60));
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ecommerce X");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);
    }

    private void initMenuItem() {
        ItemMenu im_home = new ItemMenu(1000, R.drawable.ic_store, "Home");
        im_home.subs.add(new ItemMenu(1001, "Wishlist", HomeWishlist.class));
        im_home.subs.add(new ItemMenu(1002, "New Arrivals", HomeNewArrivals.class));
        im_home.subs.add(new ItemMenu(1003, "Wallet", HomeWallet.class));
        im_home.subs.add(new ItemMenu(1003, "Round", HomeRound.class));
        im_home.subs.add(new ItemMenu(1004, "Food", HomeFood.class));
        im_home.subs.add(new ItemMenu(1005, "Fashion", HomeFashion.class));
        im_home.subs.add(new ItemMenu(1006, "Resto", HomeResto.class));
        im_home.subs.add(new ItemMenu(1007, "Gadget", HomeGadget.class));
        im_home.subs.add(new ItemMenu(1008, "Medical", HomeMedical.class));
        im_home.subs.add(new ItemMenu(1009, "Shoes Story", HomeShoesStory.class));
        im_home.subs.add(new ItemMenu(1010, "News List", HomeNewsList.class));
        im_home.subs.add(new ItemMenu(1011, "Grid", HomeGrid.class));
        im_home.subs.add(new ItemMenu(1012, "News Deal", HomeNewsDeal.class));
        im_home.subs.add(new ItemMenu(1013, "Wallet Purple", HomeWalletPurple.class));
        im_home.subs.add(new ItemMenu(1014, "Dashboard Light", HomeDashboardLight.class));
        im_home.subs.add(new ItemMenu(1015, "Books Discover", HomeBooksDiscover.class));
        im_home.subs.add(new ItemMenu(1016, "Books", HomeBooks.class));
        im_home.subs.add(new ItemMenu(1016, "Red Simple", HomeRedSimple.class));
        im_home.subs.add(new ItemMenu(1017, "Furnite", HomeFurnite.class));
        im_home.subs.add(new ItemMenu(1018, "Top Circle", HomeTopCircle.class));
        im_home.subs.add(new ItemMenu(1019, "Square Image", HomeSquareImage.class));
        im_home.subs.add(new ItemMenu(1020, "Fashion Flat", HomeFashionFlat.class));
        items.add(im_home);

        ItemMenu im_category = new ItemMenu(2000, R.drawable.ic_apps, "Category");
        im_category.subs.add(new ItemMenu(2001, "Topics", CategoryTopics.class));
        im_category.subs.add(new ItemMenu(2002, "Tags", CategoryTags.class));
        im_category.subs.add(new ItemMenu(2003, "Store", CategoryStore.class));
        im_category.subs.add(new ItemMenu(2004, "Catalog", CategoryCatalog.class));
        im_category.subs.add(new ItemMenu(2005, "Best Sellers", CategoryBestSellers.class));
        im_category.subs.add(new ItemMenu(2006, "Clothes", CategoryClothes.class));
        im_category.subs.add(new ItemMenu(2007, "Card Simple", CategoryCardSimple.class));
        im_category.subs.add(new ItemMenu(2008, "Card Two", CategoryCardTwo.class));
        im_category.subs.add(new ItemMenu(2009, "Brand Name", CategoryBrandName.class));
        im_category.subs.add(new ItemMenu(2010, "Sub Fashion", CategorySubFashion.class));
        im_category.subs.add(new ItemMenu(2011, "Fashion Woman", CategoryFashionWoman.class));
        im_category.subs.add(new ItemMenu(2012, "Grid Option", CategoryGridOption.class));
        im_category.subs.add(new ItemMenu(2013, "Slider Collection", CategorySliderCollection.class));
        items.add(im_category);

        ItemMenu im_product_details = new ItemMenu(3000, R.drawable.ic_local_mall, "Product");
        im_product_details.subs.add(new ItemMenu(3001, "Grid Property", ProductGridProperty.class));
        im_product_details.subs.add(new ItemMenu(3002, "Details Room", ProductDetailsRoom.class));
        im_product_details.subs.add(new ItemMenu(3003, "Size Color", ProductSizeColor.class));
        im_product_details.subs.add(new ItemMenu(3004, "Scroll Horizontal", ProductScrollHorizontal.class));
        im_product_details.subs.add(new ItemMenu(3005, "List Simple", ProductListSimple.class));
        im_product_details.subs.add(new ItemMenu(3006, "Desk", ProductDesk.class));
        im_product_details.subs.add(new ItemMenu(3007, "Details Fashion", ProductDetailsFashion.class));
        im_product_details.subs.add(new ItemMenu(3008, "Electronic", ProductElectronic.class));
        im_product_details.subs.add(new ItemMenu(3009, "Details Elegant", ProductsDetailsElegant.class));
        im_product_details.subs.add(new ItemMenu(3010, "New Form", ProductNewForm.class));
        im_product_details.subs.add(new ItemMenu(3011, "Room Facilities", ProductRoomFacilities.class));
        im_product_details.subs.add(new ItemMenu(3012, "Food", ProductFood.class));
        im_product_details.subs.add(new ItemMenu(3013, "Sofa", ProductSofa.class));
        im_product_details.subs.add(new ItemMenu(3014, "Variant", ProductVariant.class));
        im_product_details.subs.add(new ItemMenu(3015, "Wishlist White", ProductWishlistWhite.class));
        im_product_details.subs.add(new ItemMenu(3016, "Write Review", ProductWriteReview.class));
        im_product_details.subs.add(new ItemMenu(3017, "Wishlist Fashion", ProductWishlistFashion.class));
        im_product_details.subs.add(new ItemMenu(3018, "Details Review", ProductDetailsReview.class));
        im_product_details.subs.add(new ItemMenu(3019, "Fashion Details", ProductFashionDetails.class));
        im_product_details.subs.add(new ItemMenu(3020, "Product Sneaker", ProductSneaker.class));
        im_product_details.subs.add(new ItemMenu(3021, "Rating Comment", ProductRatingComment.class));
        im_product_details.subs.add(new ItemMenu(3022, "Phone Detail", ProductPhoneDetail.class));
        im_product_details.subs.add(new ItemMenu(3023, "Phone", ProductPhone.class));
        items.add(im_product_details);

        ItemMenu im_payment = new ItemMenu(4000, R.drawable.ic_local_atm, "Payment");
        im_payment.subs.add(new ItemMenu(4001, "Add Card", PaymentAddCard.class));
        im_payment.subs.add(new ItemMenu(4002, "Financial Profile", PaymentFinancialProfile.class));
        im_payment.subs.add(new ItemMenu(4003, "Wallet Light", PaymentWalletLight.class));
        im_payment.subs.add(new ItemMenu(4004, "Drawer Blue", PaymentDrawerBlue.class));
        im_payment.subs.add(new ItemMenu(4005, "Form Billing", PaymentFormBilling.class));
        im_payment.subs.add(new ItemMenu(4006, "Mobile Topup", PaymentMobileTopup.class));
        im_payment.subs.add(new ItemMenu(4007, "Wallet Pay", PaymentWalletPay.class));
        items.add(im_payment);

        ItemMenu im_profile = new ItemMenu(5000, R.drawable.ic_account_circle, "Profile");
        im_profile.subs.add(new ItemMenu(5001, "Big Photo", ProfileBigPhoto.class));
        im_profile.subs.add(new ItemMenu(5001, "Store", ProfileStore.class));
        im_profile.subs.add(new ItemMenu(5002, "Cash", ProfileCash.class));
        im_profile.subs.add(new ItemMenu(5003, "Points", ProfilePoints.class));
        im_profile.subs.add(new ItemMenu(5004, "Red", ProfileRed.class));
        im_profile.subs.add(new ItemMenu(5005, "Seller", ProfileSeller.class));
        im_profile.subs.add(new ItemMenu(5006, "Girl", ProfileGirl.class));
        im_profile.subs.add(new ItemMenu(5007, "Medical", ProfileMedical.class));
        im_profile.subs.add(new ItemMenu(5008, "Wallet", ProfileWallet.class));
        im_profile.subs.add(new ItemMenu(5009, "Account", ProfileAccount.class));
        im_profile.subs.add(new ItemMenu(5010, "Buyer Flat", ProfileBuyerFlat.class));
        im_profile.subs.add(new ItemMenu(5011, "Sub White", ProfileSubWhite.class));
        im_profile.subs.add(new ItemMenu(5012, "Settings", ProfileSettings.class));
        im_profile.subs.add(new ItemMenu(5013, "Menu Simple", ProfileMenuSimple.class));
        im_profile.subs.add(new ItemMenu(5014, "Order History", ProfileOrderHistory.class));
        im_profile.subs.add(new ItemMenu(5014, "Menu Stats", ProfileMenuStats.class));
        im_profile.subs.add(new ItemMenu(5015, "Sub Menu", ProfileSubMenu.class));
        im_profile.subs.add(new ItemMenu(5016, "Order History White", ProfileOrderHistoryWhite.class));
        im_profile.subs.add(new ItemMenu(5017, "Store Rating", ProfileStoreRating.class));
        im_profile.subs.add(new ItemMenu(5018, "Blue Card", ProfileBlueCard.class));
        im_profile.subs.add(new ItemMenu(5019, "Edit Data", ProfileEditData.class));
        im_profile.subs.add(new ItemMenu(5020, "Card List", ProfileCardList.class));
        im_profile.subs.add(new ItemMenu(5021, "Round Menu", ProfileRoundMenu.class));
        items.add(im_profile);

        ItemMenu im_login = new ItemMenu(6000, R.drawable.ic_phonelink_lock, "Login & Register");
        im_login.subs.add(new ItemMenu(6001, "Paypal", RegisterFormPaypal.class));
        im_login.subs.add(new ItemMenu(6002, "Blue Flat", RegisterBlueFlat.class));
        im_login.subs.add(new ItemMenu(6003, "Join", LoginJoin.class));
        im_login.subs.add(new ItemMenu(6004, "SignUp", RegisterSignUp.class));
        im_login.subs.add(new ItemMenu(6005, "Intro", LoginIntro.class));
        im_login.subs.add(new ItemMenu(6006, "Start White", LoginStartWhite.class));
        im_login.subs.add(new ItemMenu(6007, "Create Form", RegisterCreateForm.class));
        im_login.subs.add(new ItemMenu(6008, "Create Line", RegisterCreateLine.class));
        im_login.subs.add(new ItemMenu(6009, "Round Smooth", LoginRoundSmooth.class));
        im_login.subs.add(new ItemMenu(6010, "Food Image", RegisterFoodImage.class));
        im_login.subs.add(new ItemMenu(6011, "Big Image Fashion", LoginBigImageFashion.class));
        im_login.subs.add(new ItemMenu(6012, "Register Round Blue", RegisterRoundBlue.class));
        im_login.subs.add(new ItemMenu(6013, "Login Round Blue", LoginRoundBlue.class));
        im_login.subs.add(new ItemMenu(6014, "OTP Verification", LoginOtpVerification.class));
        im_login.subs.add(new ItemMenu(6015, "Register Started", RegisterStarted.class));
        items.add(im_login);

        ItemMenu im_search = new ItemMenu(7000, R.drawable.ic_nature_people, "Search");
        im_search.subs.add(new ItemMenu(7001, "House", SearchHouse.class));
        im_search.subs.add(new ItemMenu(7002, "Address Option", SearchAddressOption.class));
        im_search.subs.add(new ItemMenu(7003, "Fashion", SearchFashion.class));
        im_search.subs.add(new ItemMenu(7004, "Hotels", SearchHotels.class));
        im_search.subs.add(new ItemMenu(7005, "Filter White", SearchFilterWhite.class));
        im_search.subs.add(new ItemMenu(7006, "Filter Bottom", SearchFilterBottom.class));
        im_search.subs.add(new ItemMenu(7007, "Search Filter Complete", SearchFilterComplete.class));
        im_search.subs.add(new ItemMenu(7008, "Explore Red", SearchExploreRed.class));
        im_search.subs.add(new ItemMenu(7009, "Store Finder", SearchStoreFinder.class));
        im_search.subs.add(new ItemMenu(7010, "Suggestion Blue", SearchSuggestionBlue.class));
        im_search.subs.add(new ItemMenu(7011, "Suggestion Light", SearchSuggestionLight.class));
        im_search.subs.add(new ItemMenu(7012, "Filter Grocery", SearchFilterGrocery.class));
        im_search.subs.add(new ItemMenu(7013, "Google", SearchGoogle.class));
        im_search.subs.add(new ItemMenu(7014, "Filter Phone", SearchFilterPhone.class));
        items.add(im_search);

        ItemMenu im_process = new ItemMenu(8000, R.drawable.ic_exit_to_app, "Process");
        im_process.subs.add(new ItemMenu(8001, "Order Track", ProcessOrderTrack.class));
        im_process.subs.add(new ItemMenu(8002, "Delivery", ProcessDelivery.class));
        im_process.subs.add(new ItemMenu(8003, "Invoice", ProcessInvoice.class));
        im_process.subs.add(new ItemMenu(8004, "Checkout Card", ProcessCheckoutCard.class));
        im_process.subs.add(new ItemMenu(8005, "Ship Option", ProcessShipOption.class));
        im_process.subs.add(new ItemMenu(8006, "Order Track List", ProcessOrderTrackList.class));
        im_process.subs.add(new ItemMenu(8007, "Deliv Form", ProcessDelivForm.class));
        im_process.subs.add(new ItemMenu(8008, "Addressing", ProcessAddressing.class));
        im_process.subs.add(new ItemMenu(8009, "Cart Light", ProcessCartLight.class));
        im_process.subs.add(new ItemMenu(8010, "History", ProcessHistory.class));
        im_process.subs.add(new ItemMenu(8011, "Address Form", ProcessAddressForm.class));
        im_process.subs.add(new ItemMenu(8012, "Order Success", ProcessOrderSuccess.class));
        im_process.subs.add(new ItemMenu(8013, "Order Status", ProcessOrderStatus.class));
        im_process.subs.add(new ItemMenu(8014, "Notif Activity", ProcessNotifActivity.class));
        im_process.subs.add(new ItemMenu(8015, "Notif Dark", ProcessNotifDark.class));
        im_process.subs.add(new ItemMenu(8016, "Promo Code", ProcessPromoCode.class));
        im_process.subs.add(new ItemMenu(8016, "Checkout Details", ProcessCheckoutDetails.class));
        im_process.subs.add(new ItemMenu(8017, "Delivery Track", ProcessDeliveryTrack.class));
        im_process.subs.add(new ItemMenu(8018, "Round Order Status", ProcessRoundOrderStatus.class));
        im_process.subs.add(new ItemMenu(8019, "Confirmation Order", ProcessConfirmOrder.class));
        im_process.subs.add(new ItemMenu(8020, "Food Order", ProcessFoodOrder.class));
        im_process.subs.add(new ItemMenu(8021, "Card Order", ProcessCardOrder.class));

        items.add(im_process);

        ItemMenu im_promo = new ItemMenu(9000, R.drawable.ic_offer, "Promo");
        im_promo.subs.add(new ItemMenu(9001, "Code List", PromoCodeList.class));
        im_promo.subs.add(new ItemMenu(9002, "Coupon Code", PromoCouponCode.class));
        im_promo.subs.add(new ItemMenu(9003, "Apply Coupon", PromoCouponApply.class));
        im_promo.subs.add(new ItemMenu(9004, "Voucher List", PromoVoucherList.class));
        items.add(im_promo);

        ItemMenu im_other = new ItemMenu(10000, R.drawable.ic_add_box, "Other");
        im_other.subs.add(new ItemMenu(10001, "FAQ flat", OtherFaqFlat.class));
        im_other.subs.add(new ItemMenu(10001, "Ticket Coupon", OthersTicketCoupon.class));
        items.add(im_other);

    }

    private void initComponent() {
        // define recycler view
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        recycler_view.setHasFixedSize(true);
        recycler_view.setNestedScrollingEnabled(false);

        //set data and list adapter
        adapter = new AdapterMainMenu(this, items);
        recycler_view.setAdapter(adapter);

        // on item list clicked
        adapter.setOnItemClickListener(new AdapterMainMenu.OnItemClickListener() {
            @Override
            public void onItemClick(View view, ItemMenu obj, int position) {
                startActivity(new Intent(MainMenu.this, obj.activity));
            }
        });
    }

    private void initDrawerMenu() {
        final NavigationView nav_view = findViewById(R.id.nav_view);
        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            public void onDrawerOpened(View drawerView) {
                updateCounter(nav_view);
                super.onDrawerOpened(drawerView);
            }
        };

        drawer.setDrawerListener(toggle);

        Button bt_get_source = nav_view.findViewById(R.id.bt_get_source);
        bt_get_source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.openInAppBrowser(MainMenu.this, "https://codecanyon.net/user/dream_space/portfolio", false);
            }
        });
    }


    public void onDrawerMenuClick(View view) {
        int menu_id = view.getId();
        switch (menu_id) {
            case R.id.nav_menu_notif:

                break;
            case R.id.nav_menu_more:
                Tools.openInAppBrowser(MainMenu.this, "http://portfolio.dream-space.web.id/", false);
                break;
            case R.id.nav_menu_rate:
                Tools.rateAction(MainMenu.this);
                break;
            case R.id.nav_menu_hire:
                Tools.openInAppBrowserOriginal(MainMenu.this, "https://codecanyon.net/user/dream_space");
                break;
            case R.id.nav_menu_about:
                Tools.showDialogAbout(MainMenu.this);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        Tools.changeMenuIconColor(menu, getResources().getColor(R.color.grey_60));
        final MenuItem menu_notif = menu.findItem(R.id.action_notifications);
        View actionView = MenuItemCompat.getActionView(menu_notif);
        notif_badge = actionView.findViewById(R.id.notif_badge);
        setupBadge();
        actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOptionsItemSelected(menu_notif);
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (!drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.openDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.END);
            }
        } else if (item.getItemId() == R.id.action_notifications) {

        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateCounter(NavigationView nav) {
        View drw_notif_badge = nav.findViewById(R.id.notif_badge);
        if (notification_count == 0) {
            drw_notif_badge.setVisibility(View.GONE);
        } else {
            drw_notif_badge.setVisibility(View.VISIBLE);
        }
    }

    private void setupBadge() {
        if (notif_badge == null) return;
        if (notification_count == 0) {
            notif_badge.setVisibility(View.GONE);
        } else {
            notif_badge.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        int new_notif_count = 0;
        if (new_notif_count != notification_count) {
            notification_count = new_notif_count;
            invalidateOptionsMenu();
        }
    }

    public static boolean active = false;

    @Override
    public void onStart() {
        super.onStart();
        active = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        active = false;
    }
}
