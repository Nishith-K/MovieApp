import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//import { CustomersListComponent } from './customers-list/customers-list.component';
//import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { GetMoviesComponent } from './get-movies/get-movies.component';

const routes: Routes = [
    { path: '', redirectTo: 'movie', pathMatch: 'full' },
    //{ path: 'movie', component: CustomersListComponent },
    //{ path: 'add', component: CreateCustomerComponent },
    { path: '', component: GetMoviesComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule {}
