import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-list',
  imports: [],
  templateUrl: './producto-list.component.html'
})
export class ProductoListComponent {

  productos: Producto[];

  constructor(private productoService: ProductoService){}

  ngOnInit(){
    this.obtenerProductos();
    
  }

  private obtenerProductos(){
    //Consumir los servicios del observable (suscribirnos)
    this.productoService.getProductList().subscribe(
      (datos => {
        this.productos = datos;
      })
    );

  }

}
