import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-producto-lista',
  imports: [CommonModule],
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {

  productos : Producto[];

  constructor(private productoServicio: ProductoService){}

  ngOnInit(){
    this.obtenerProductos();
  }

  private obtenerProductos(){
    this.productoServicio.obtenerProductoLista().subscribe(
      (datos => {
        this.productos = datos;
      })
    )
  }

}
