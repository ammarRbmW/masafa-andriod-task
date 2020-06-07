package com.example.masafa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    @Expose
    @SerializedName("CART")
    private Cart cart;
    @Expose
    @SerializedName("WEB_SALE")
    private String webSale;
    @Expose
    @SerializedName("TIMER")
    private Timer timer;
    @Expose
    @SerializedName("STATE")
    private String state;
    @Expose
    @SerializedName("PRODUCT_LINK")
    private String productLink;
    @Expose
    @SerializedName("CART_DATA")
    private CartData cartData;
    @Expose
    @SerializedName("PRICES")
    private Prices prices;
    @Expose
    @SerializedName("IMAGE")
    private Image image;
    @Expose
    @SerializedName("HIGHLIGHT")
    private String highlight;
    @Expose
    @SerializedName("PRE_ORDER")
    private String preOrder;
    @Expose
    @SerializedName("ACTIVE_TO")
    private String activeTo;
    @Expose
    @SerializedName("ACTIVE_FROM")
    private String activeFrom;
    @Expose
    @SerializedName("IMAGE_FILE")
    private String imageFile;
    @Expose
    @SerializedName("SORT")
    private String sort;
    @Expose
    @SerializedName("NAME")
    private String name;
    @Expose
    @SerializedName("LINKED_SECTION_CODE")
    private String linkedSectionCode;
    @Expose
    @SerializedName("LINKED_PROD_ID")
    private String linkedProdId;
    @Expose
    @SerializedName("ID")
    private String id;


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getWebSale() {
        return webSale;
    }

    public void setWebSale(String webSale) {
        this.webSale = webSale;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public CartData getCartData() {
        return cartData;
    }

    public void setCartData(CartData cartData) {
        this.cartData = cartData;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getPreOrder() {
        return preOrder;
    }

    public void setPreOrder(String preOrder) {
        this.preOrder = preOrder;
    }

    public String getActiveTo() {
        return activeTo;
    }

    public void setActiveTo(String activeTo) {
        this.activeTo = activeTo;
    }

    public String getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(String activeFrom) {
        this.activeFrom = activeFrom;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkedSectionCode() {
        return linkedSectionCode;
    }

    public void setLinkedSectionCode(String linkedSectionCode) {
        this.linkedSectionCode = linkedSectionCode;
    }

    public String getLinkedProdId() {
        return linkedProdId;
    }

    public void setLinkedProdId(String linkedProdId) {
        this.linkedProdId = linkedProdId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
