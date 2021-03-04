package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "ShipmentData", description = "Shipment data", implementation = ShipmentData.class)
public class ShipmentData {

    @Schema(name = "salutation", example = "MR", description = "Salutation of the delivery address contact person", enumeration = {"MR", "MS"}, implementation = String.class)
    private String salutation;

    @Schema(name = "quantity", example = "1", description = "Item quantity", implementation = Integer.class)
    private Integer quantity;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getSalutation() {
        return salutation;
    }
}
