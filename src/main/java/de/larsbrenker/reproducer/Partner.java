package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "Partner", description = "Partner information.", implementation = Partner.class)
public class Partner {

    @Schema(name = "id", example = "1", description = "ID of the partner", implementation = Integer.class)
    private Integer id;

    @Schema(name = "legal", example = "GmbH", description = "Legal of Company", enumeration = {"GmbH", "AG"}, implementation = String.class)
    private String legal;

    @Schema(required = true, name = "shipmentData", description = "Shipment data of the partner", implementation = ShipmentData.class)
    private ShipmentData shipmentData;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public Integer getId() {
        return id;
    }

    public ShipmentData getShipmentData() {
        return shipmentData;
    }

    public void setShipmentData(ShipmentData shipmentData) {
        this.shipmentData = shipmentData;
    }
}
