package ModelosDTO;

import java.sql.Date;

/**
 *
 * @author edgar
 */
public class Producto {

    private int idProducto;
    private String nombreProducto;
    private float precioVenta;
    private float precioCompra;
    private Date fechaCaducidad;
    private int idTipoProd1;
    private int idProveedorProd;

    public Producto(int idProducto, String nombreProducto, float precioVenta, float precioCompra, Date fechaCaducidad, int idTipoProd1, int idProveedorProd) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.fechaCaducidad = fechaCaducidad;
        this.idTipoProd1 = idTipoProd1;
        this.idProveedorProd = idProveedorProd;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getIdTipoProd1() {
        return idTipoProd1;
    }

    public void setIdTipoProd1(int idTipoProd1) {
        this.idTipoProd1 = idTipoProd1;
    }

    public int getIdProveedorProd() {
        return idProveedorProd;
    }

    public void setIdProveedorProd(int idProveedorProd) {
        this.idProveedorProd = idProveedorProd;
    }

}
