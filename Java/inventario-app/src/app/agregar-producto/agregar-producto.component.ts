import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

import { FormsModule } from '@angular/forms';
import { error } from 'console';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agregar-producto',
  imports: [FormsModule],
  templateUrl: './agregar-producto.component.html',
  styleUrl: './agregar-producto.component.css'
})
export class AgregarProductoComponent {

  producto : Producto = new Producto();

  constructor(private prodtoServicio: ProductoService, private enrutador: Router){
    
  }

  onSubmit(){
    this.guardarProducto();
  }

  guardarProducto(){

    this.prodtoServicio.agregarProducto(this.producto).subscribe({
      next:(datos) => {

        this.irListaProductos();

      }, error:(error:any) => {console.log(error)}
    });
  }

  irListaProductos(){
    this.enrutador.navigate(['/productos']);
  }

}
