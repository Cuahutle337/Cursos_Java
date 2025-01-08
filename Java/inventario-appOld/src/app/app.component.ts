import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductoListComponent } from "./producto-list/producto-list.component";

@Component({
  selector: 'app-root',
  imports: [ ProductoListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'inventario-app';
}
 