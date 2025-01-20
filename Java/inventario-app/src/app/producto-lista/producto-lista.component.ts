import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-producto-lista',
  imports: [CommonModule],
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {

  productos : Producto[];

  constructor(private productoServicio: ProductoService, private enrutador: Router){}

  ngOnInit(){
    this.obtenerProductos();
  }

  private obtenerProductos(){
    this.productoServicio.obtenerProductoLista().subscribe(
      (datos => {
        console.log(datos);
        this.productos = datos;
      })
    )
  }

  editarProducto(id : number ){

    this.enrutador.navigate(['editar-producto',id]);

  }

  eliminarProducto(id:number){
    this.productoServicio.eliminarProducto(id).subscribe(
      {
        next:(datos) => this.obtenerProductos(),
        error:(errores) => console.log(errores)
      }
    );

  }

}
