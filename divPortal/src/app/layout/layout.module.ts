import { MalihuScrollbarModule } from 'ngx-malihu-scrollbar';
import { HomeModule } from './../routes/home/home.module';
import { NgModule } from '@angular/core';
import { LayoutComponent } from './layout.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { HeaderComponent } from './header/header.component';
import { NavsearchComponent } from './header/navsearch/navsearch.component';
import { OffsidebarComponent } from './offsidebar/offsidebar.component';
import { FooterComponent } from './footer/footer.component';
import { SharedModule } from '../shared/shared.module';

@NgModule({
    imports: [
        SharedModule, HomeModule,
        MalihuScrollbarModule.forRoot()
    ],
    providers: [
    ],
    declarations: [
        LayoutComponent,
        SidebarComponent,
        HeaderComponent,
        NavsearchComponent,
        OffsidebarComponent,
        FooterComponent
    ],
    exports: [
        LayoutComponent,
        SidebarComponent,
        HeaderComponent,
        NavsearchComponent,
        OffsidebarComponent,
        FooterComponent
    ]
})
export class LayoutModule { }
