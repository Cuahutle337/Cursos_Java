import ListarEmpleado from "./empleados/ListarEmpleado";
import React  from 'react';
import Navegacion from "./plantilla/Navegacion";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import AgregarEmpleado from "./empleados/AgregarEmpleado";
import ActualizaEmpleado from "./empleados/ActualizaEmpleado";




function App() {
  return (
    <div className="container">
     <BrowserRouter>
      <Navegacion/>
      <Routes>
        <Route exact path='/' element={<ListarEmpleado/>}/>
        <Route exact path="/agregar" element={<AgregarEmpleado/>}/>
        <Route exact path="/actualizar/:id" element = {<ActualizaEmpleado/>}/>
      </Routes>
     </BrowserRouter>
    </div>
    
  );
}

export default App;
